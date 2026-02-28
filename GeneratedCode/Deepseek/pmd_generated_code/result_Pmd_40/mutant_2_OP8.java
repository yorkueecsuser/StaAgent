import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream x = new FileInputStream("/tmp/bugger");
        } catch (IOException y) {
            // BUG: EmptyCatchBlock
        }
    }

    public void showBug() {
        doSomething();
    }
}