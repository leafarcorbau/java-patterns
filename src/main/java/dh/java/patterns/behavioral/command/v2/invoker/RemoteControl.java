package dh.java.patterns.behavioral.command.v2.invoker;

import dh.java.patterns.behavioral.command.v2.command.Command;
import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class RemoteControl {
    Command command;

    public String buttonPressed(){
        return command.execute();
    }
}
