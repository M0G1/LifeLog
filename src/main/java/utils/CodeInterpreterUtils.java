package utils;

import controller.ArgsInterpreter;

public class CodeInterpreterUtils {
    // ========================= PREDICATE METHODS ===============================================================
    public static boolean isLog(String argument) {
        return argument.equals(ArgsInterpreter.FirstArgumentType.LOG.getValue());
    }
    public static boolean isCommand(String argument) {
        return argument.equals(ArgsInterpreter.FirstArgumentType.COMMAND.getValue());
    }

}
