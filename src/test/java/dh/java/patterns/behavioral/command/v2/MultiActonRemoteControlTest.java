package dh.java.patterns.behavioral.command.v2;

import dh.java.patterns.behavioral.command.v2.command.GarageDoorCloseCommand;
import dh.java.patterns.behavioral.command.v2.command.GarageDoorOpenCommand;
import dh.java.patterns.behavioral.command.v2.command.LightOffCommand;
import dh.java.patterns.behavioral.command.v2.command.LightOnCommand;
import dh.java.patterns.behavioral.command.v2.device.GarageDoor;
import dh.java.patterns.behavioral.command.v2.device.Light;
import dh.java.patterns.behavioral.command.v2.invoker.MultiActionRemoteControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static dh.java.patterns.behavioral.command.v2.invoker.Action.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MultiActonRemoteControlTest {

    private MultiActionRemoteControl multiActionRemoteControl;

    @BeforeEach
    public void init() {
        final Light light = Light.builder().build();
        final GarageDoor garageDoor = GarageDoor.builder().build();

        multiActionRemoteControl = new MultiActionRemoteControl();
        multiActionRemoteControl.addCommand(LIGHT_ON, new LightOnCommand(light));
        multiActionRemoteControl.addCommand(LIGHT_OFF, new LightOffCommand(light));
        multiActionRemoteControl.addCommand(GARAGE_DOOR_OPEN, new GarageDoorOpenCommand(garageDoor));
        multiActionRemoteControl.addCommand(GARAGE_DOOR_CLOSE, new GarageDoorCloseCommand(garageDoor));
    }

    @Test
    public void executeLightOn(){
        //Given
        final String expected = "light on";
        //When
        final String result = multiActionRemoteControl.buttonPressed(LIGHT_ON);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeLightOff(){
        //Given
        final String expected = "light off";
        //When
        final String result = multiActionRemoteControl.buttonPressed(LIGHT_OFF);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeGarageDoorOpen(){
        //Given
        final String expected =
                "GarageDoor lightOn"+", "+
                "GarageDoor up"+", "+
                "GarageDoor stop"+", "+
                "GarageDoor lightOff";
        //When
        final String result = multiActionRemoteControl.buttonPressed(GARAGE_DOOR_OPEN);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeGarageDoorClose(){
        //Given
        final String expected =
                "GarageDoor lightOn"+", "+
                "GarageDoor down"+", "+
                "GarageDoor stop"+", "+
                "GarageDoor lightOff";
        //When
        final String result = multiActionRemoteControl.buttonPressed(GARAGE_DOOR_CLOSE);
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeWrongAction(){
        //Given
        multiActionRemoteControl = new MultiActionRemoteControl();

        final String expected = "No Action Available";
        //When
        final String result = multiActionRemoteControl.buttonPressed(GARAGE_DOOR_CLOSE);
        //Then
        assertThat(result).isEqualTo(expected);
    }
}
