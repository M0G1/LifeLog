package concept;

import java.util.List;
import java.util.Timer;

public class Task {
    public enum State {
        UNKNOWN("UNKNOWN"),
        LOGGED("LOGGED"),
        VALID("VALID"),
        WAITED("WAITED"),
        PERFORMED("PERFORMED");
        // Enum must grow only to bottom(save ordinal previous values)
        private final String value;

        State(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    // =========================== INSTANCE FIELDS =================================
    private Command command;
    private Runnable action;
    private List<Class> customClasses;
    private State state;
    private Timer timer;

}
