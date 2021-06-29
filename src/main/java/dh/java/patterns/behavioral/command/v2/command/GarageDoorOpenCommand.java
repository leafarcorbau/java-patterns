package dh.java.patterns.behavioral.command.v2.command;

import dh.java.patterns.behavioral.command.v2.device.GarageDoor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    @Override
    public String execute() {
        return garageDoor.lightOn()+", "+
                garageDoor.up()+", "+
                garageDoor.stop()+", "+
                garageDoor.lightOff();
    }
}
