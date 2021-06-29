package dh.java.patterns.behavioral.command.v2.device;

import lombok.Builder;

@Builder
public class Light {

    public String on(){
        return "light on";
    }

    public String off(){
        return"light off";
    }
}
