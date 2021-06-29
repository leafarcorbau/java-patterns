package dh.java.patterns.behavioral.command.v2.command;

import dh.java.patterns.behavioral.command.v2.device.Light;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor
public class LightOnCommand implements Command{
    Light light;
    @Override
    public String execute() {
        return light.on();
    }
}
