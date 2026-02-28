import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getCondition() {
        return false;
    }

    public void showBug1() {
        if (getCondition()) {
            int value = 1;
            switch (value) {
                case 2:
                    String.format("This line is unreachable %d", "Hello World");
                    break;
            }
        }
        String.format("The value of my integer is %d", "Hello World");
    }

    //... Other methods remain unchanged...
}