package dh.java.patterns.behavioral.command.v1;

import dh.java.patterns.behavioral.command.v1.device.GarageDoor;
import dh.java.patterns.behavioral.command.v1.device.Light;

public class MultiActionRemoteControl {

    private GarageDoor garageDoor;
    private Light light;

    public MultiActionRemoteControl(){
        garageDoor = GarageDoor.builder().build();
        light = Light.builder().build();
    }

    public String buttonPressed(final Action action){
    final String result= switch (action){
        case LIGHT_ON -> light.on();
        case LIGHT_OFF -> light.off();
        case GARAGE_DOOR_OPEN ->
                garageDoor.lightOn()+", "+
                garageDoor.up()+", "+
                garageDoor.stop()+", "+
                garageDoor.lightOff();
        case GARAGE_DOOR_CLOSE ->
                garageDoor.lightOn()+", "+
                garageDoor.down()+", "+
                garageDoor.stop()+", "+
                garageDoor.lightOff();
    };


       return result;
    }
}
