import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            boolean unreachable = false;
            switch (unreachable) {
                case true: // Unreachable code
                    break;
                default:
                    break;
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}