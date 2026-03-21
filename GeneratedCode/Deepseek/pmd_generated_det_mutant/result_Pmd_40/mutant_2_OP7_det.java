import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean ynznspyd = false;while (ynznspyd && true && false && false && true && true && false && true && true && false && true && false) {String koevjkbt = "xvfwccfg";}
        }
    
}

    public void showBug() {
        doSomething();
    }
}