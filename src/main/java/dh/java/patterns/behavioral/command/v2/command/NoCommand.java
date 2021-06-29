package dh.java.patterns.behavioral.command.v2.command;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@NoArgsConstructor
public class NoCommand implements Command{
    private static final String NO_ACTION_MSG = "No Action Available";
    @Override
    public String execute() {
        return NO_ACTION_MSG;
    }
}
