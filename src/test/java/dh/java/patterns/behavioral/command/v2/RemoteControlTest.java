package dh.java.patterns.behavioral.command.v2;

import dh.java.patterns.behavioral.command.v2.command.*;
import dh.java.patterns.behavioral.command.v2.device.GarageDoor;
import dh.java.patterns.behavioral.command.v2.device.Light;
import dh.java.patterns.behavioral.command.v2.invoker.RemoteControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteControlTest {

    private RemoteControl remoteControl;

    @BeforeEach
    public void init(){
        remoteControl = RemoteControl.builder().build();
    }
    @Test
    public void executeLightOn(){
        //Given
        final Light light = Light.builder().build();
        final Command command = LightOnCommand
                .builder()
                .light(light)
                .build();
        final String expected = "light on";
        remoteControl.setCommand(command);
        //When
        final String result = remoteControl.buttonPressed();
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeLightOff(){
        //Given
        final Light light = Light.builder().build();
        final Command command = LightOffCommand
                .builder()
                .light(light)
                .build();
        final String expected = "light off";
        remoteControl.setCommand(command);
        //When
        final String result = remoteControl.buttonPressed();
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeGarageDoorOpen(){
        //Given
        final GarageDoor garageDoor = GarageDoor.builder().build();
        final Command command = GarageDoorOpenCommand
                .builder()
                .garageDoor(garageDoor)
                .build();
        final String expected =
                "GarageDoor lightOn"+", "+
                "GarageDoor up"+", "+
                "GarageDoor stop"+", "+
                "GarageDoor lightOff";
        remoteControl.setCommand(command);
        //When
        final String result = remoteControl.buttonPressed();
        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void executeGarageDoorClose(){
        //Given
        final GarageDoor garageDoor = GarageDoor.builder().build();
        final Command command = GarageDoorCloseCommand
                .builder()
                .garageDoor(garageDoor)
                .build();
        final String expected =
                "GarageDoor lightOn"+", "+
                "GarageDoor down"+", "+
                "GarageDoor stop"+", "+
                "GarageDoor lightOff";
        remoteControl.setCommand(command);
        //When
        final String result = remoteControl.buttonPressed();
        //Then
        assertThat(result).isEqualTo(expected);
    }
}
