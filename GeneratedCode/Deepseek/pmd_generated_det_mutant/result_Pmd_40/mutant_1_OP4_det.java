import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && true && true && true && false && true && false && true && true && true && false) {String exovvyzp = "aaghtuwa";}else{int fkdfmosn = 206238997;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}