import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean dhrshdvv = false;while (dhrshdvv && false && true && false && true && false && false && true && false && false && true && false) {int ienwhmue = -93239955;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}