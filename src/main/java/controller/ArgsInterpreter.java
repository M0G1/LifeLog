package controller;

import concept.Command;

import java.util.Arrays;
import java.util.Locale;

public class ArgsInterpreter {
    public enum FirstArgumentType {
        LOG("log"),
        COMMAND("command");
        // Enum must grow only to bottom(save ordinal previous values)
        private final String value;

        FirstArgumentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static Command handleArgs(String[] args) {
//        assert args.length > 0;
        String[] zeroSuffixArgs = Arrays.copyOfRange(args, 1, args.length);
        switch (FirstArgumentType.valueOf(args[0].toLowerCase())){
            case LOG:
//                LogInterpreter.
                break;
            case COMMAND:
                break;
        }
        return Command.EMPTY_COMMAND;
    }
}
