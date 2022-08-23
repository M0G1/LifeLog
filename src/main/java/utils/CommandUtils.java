package utils;

import concept.Command;


public class CommandUtils {
    public static Command.State getNextState(Command.State state) {
        int stateOrdinal = state.ordinal(); // Enum must grow only to bottom(save ordinal previous values)
        if (Command.State.UNKNOWN.ordinal() == stateOrdinal || Command.State.INTERPRETED.ordinal() == stateOrdinal)
            return Command.State.UNKNOWN;
        return Command.State.values()[stateOrdinal + 1];
    }

    public static void setNextState(Command command) {
        command.setState(getNextState(command.getState()));
    }

    // ========================= PREDICATE METHODS ===============================================================
    public static boolean isLogged(Command command) {
        return command.getState().equals(Command.State.LOGGED);
    }

    public static boolean isValid(Command command) {
        return command.getState().equals(Command.State.VALID);
    }

    public static boolean isInterpreted(Command command) {
        return command.getState().equals(Command.State.INTERPRETED);
    }

    public static boolean isStored(Command command) {
        return command.getState().equals(Command.State.STORED);
    }

    public static boolean isUnknown(Command command) {
        return command.getState().equals(Command.State.UNKNOWN);
    }
}
