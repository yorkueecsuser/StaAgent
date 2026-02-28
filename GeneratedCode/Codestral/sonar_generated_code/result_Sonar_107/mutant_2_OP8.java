import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showMutant1() {
        String b = "Hello World";
        String.format("The value of my integer is %d", b);
    }

    public void showMutant2() {
        int a = 1;
        String.format("Not enough arguments %d and %d", a);
    }

    public void showMutant3() {
        String c = "value";
        MessageFormat.format("Result {1}.", c);
    }

    public void showMutant4() {
        int d = 14;
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", d);
    }

    public void showBug1() {
        String.format("The value of my integer is %d", "Hello World");
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }
}