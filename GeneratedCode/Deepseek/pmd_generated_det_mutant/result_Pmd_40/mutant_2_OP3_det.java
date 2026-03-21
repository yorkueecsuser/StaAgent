import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && true && false && false && false && true && false && true && true && true && false) {boolean kysfxssp = true;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}