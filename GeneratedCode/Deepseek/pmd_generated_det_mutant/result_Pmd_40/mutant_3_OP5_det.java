import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int hmsoldqv = 0;switch  (hmsoldqv) {case 1:short iaclxjvn = -9185;break;default:short esghvthj = -7435;break;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}