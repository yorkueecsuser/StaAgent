import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceInjectOnFinalField {
    private final String buggyField;

    public GuiceInjectOnFinalField(String injectedValue) {
        this.buggyField = injectedValue; 
    }

    public String showBug() {
        return buggyField;
    }
    
    public static void main(String[] args) {
        GuiceInjectOnFinalField bugExample = new GuiceInjectOnFinalField("This is a bug");
        System.out.println(bugExample.showBug());
    }
}