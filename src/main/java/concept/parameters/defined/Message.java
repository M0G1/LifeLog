package concept.parameters.defined;

import com.beust.jcommander.Parameter;
import concept.parameters.AbstractParameter;

public class Message extends AbstractParameter {
    @Parameter(names = {"msg"}, description = "message")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
