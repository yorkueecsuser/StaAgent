import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && false && false && true && true && true && false && false && false && true && false) {String ngohucrn = "fywgookn";}
        }
    
}

    public void showBug() {
        doSomething();
    }
}