import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean mulghuww = false;while (mulghuww && true && false && true && true && true && false && true && false && true && true && false) {String zxljoilg = "maqlaixg";}
        }
    
}

    public void showBug() {
        doSomething();
    }
}