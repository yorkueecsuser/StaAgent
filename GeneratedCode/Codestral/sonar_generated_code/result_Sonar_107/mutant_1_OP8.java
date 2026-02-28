import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        String text = "Hello World";
        String.format("The value of my integer is %d", text);  // 'text' renamed from 'Hello World'
    }

    public void showBug2() {
        int num = 1;
        String.format("Not enough arguments %d and %d", num);  // 'num' renamed from '1'
    }

    public void showBug3() {
        String value = "value";
        MessageFormat.format("Result {1}.", value);  // 'value' renamed from 'value'
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        int result = 14;
        logger.log(Level.SEVERE, "Result {1}!", result);  //'result' renamed from '14'
    }
}