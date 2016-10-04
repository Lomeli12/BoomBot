package net.lomeli.boombot.api.commands;

public interface Command {
    String execute(CommandInterface cmd);

    String getName();

    boolean canUserExecute(CommandInterface cmd);

    boolean canBotExecute(CommandInterface cmd);

    String failedToExecuteMessage(CommandInterface cmd);
}
