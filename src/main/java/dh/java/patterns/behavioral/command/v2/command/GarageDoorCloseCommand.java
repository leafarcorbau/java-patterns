package dh.java.patterns.behavioral.command.v2.command;

import dh.java.patterns.behavioral.command.v2.device.GarageDoor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;
    @Override
    public String execute() {
        return garageDoor.lightOn()+", "+
                garageDoor.down()+", "+
                garageDoor.stop()+", "+
                garageDoor.lightOff();
    }
}
