package concept;


import controller.ArgsInterpreter;

public class Command {
    public enum State {
        UNKNOWN("UNKNOWN"),
        LOGGED("LOGGED"),
        VALID("VALID"),
        INTERPRETED("INTERPRETED"),
        STORED("STORED");
        // Enum must grow only to bottom(save ordinal previous values)
        private final String value;

        State(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static final Command EMPTY_COMMAND = new Command(ArgsInterpreter.FirstArgumentType.LOG.getValue());

    // ============================== CONSTRUCTORS =================================

    public Command(String code) {
        this.code = code;
        this.state = State.LOGGED;
    }

    // =========================== INSTANCE FIELDS =================================
    private String code; // immutable
    private State state;

    // ============================ ACCESS METHODS =================================
    public String getCode() {
        return code;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

