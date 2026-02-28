import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    private boolean condition;

    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            while(condition) {
            	// added while loop to avoid unreachable code error 
            }
            // BUG: EmptyCatchBlock
        }
    }

    public void showBug() {
        doSomething();
    }
}