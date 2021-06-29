package dh.java.patterns.behavioral.command.v1.device;

import lombok.Builder;

@Builder
public class GarageDoor {

    public String up(){
        return "GarageDoor up";
    }

    public String down(){
        return "GarageDoor down";
    }

    public String stop(){
        return "GarageDoor stop";
    }

    public String lightOn(){
       return "GarageDoor lightOn";
    }

    public String lightOff(){
        return "GarageDoor lightOff";
    }
}
