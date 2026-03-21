import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (true && false && false && true && true && false && true && true && false && false && false) {double nmpsxbku = 318600880;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}