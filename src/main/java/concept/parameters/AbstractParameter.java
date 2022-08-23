package concept.parameters;

import java.util.Date;
import java.util.Locale;

public abstract class AbstractParameter {
    protected Date creation = new Date();
    protected Locale locale;

    // ============================ ACCESS METHODS =================================

    public Date getCreation() {
        return creation;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}