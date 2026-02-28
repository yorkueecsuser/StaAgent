import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    //... original methods here...

    public void newMethodWithUnreachableIf() {
        int x = 10;

        // Adding unreachable if statement
        if (x > 20) {
            System.out.println("This line will never be executed.");
        }
    }
}