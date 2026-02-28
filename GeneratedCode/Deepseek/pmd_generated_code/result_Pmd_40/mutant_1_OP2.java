import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
    }

    public void showBug() {
        doSomething();
    }
}

class EmptyCatchBlockExampleMutant {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // EmptyCatchBlock killed by mutation
            ioe.printStackTrace();
        }
    }

    public void showBug() {
        doSomething();
    }
}