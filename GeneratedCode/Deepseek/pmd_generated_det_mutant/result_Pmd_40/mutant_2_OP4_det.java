import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (true && false && true && true && false && true && true && true && true && true && false) {double qghsnvay = 838570429;}else{int bpnjdusc = 525836452;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}