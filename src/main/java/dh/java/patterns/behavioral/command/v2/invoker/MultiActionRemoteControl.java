package dh.java.patterns.behavioral.command.v2.invoker;

import dh.java.patterns.behavioral.command.v2.command.Command;
import dh.java.patterns.behavioral.command.v2.command.NoCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static dh.java.patterns.behavioral.command.v2.invoker.Action.NO_COMMAND;

public class MultiActionRemoteControl {
    private Map<Action, Command> commands;

    public MultiActionRemoteControl(){
        commands = new HashMap<>();
        commands.put(NO_COMMAND, NoCommand.builder().build());
    }

    public void addCommand(final Action name, final Command command){
        if(name!=null){
            commands.put(name, command);
        }
    }

    public String buttonPressed(final Action name){

        final Optional<Command> optionalCommand = Optional.ofNullable(commands.get(name));
        return optionalCommand.isPresent()?
                optionalCommand.get().execute():
                commands.get(NO_COMMAND).execute();
    }
}
