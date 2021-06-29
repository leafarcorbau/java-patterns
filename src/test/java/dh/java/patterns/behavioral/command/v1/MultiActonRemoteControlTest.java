package dh.java.patterns.behavioral.command.v1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static dh.java.patterns.behavioral.command.v1.Action.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MultiActonRemoteControlTest {

    private MultiActionRemoteControl multiActionRemoteControl;

    @BeforeEach
    public void init() {
        multiActionRemoteControl = new MultiActionRemoteControl();
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
}
