import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && true && true && false && true && false && true && false && false && true && false) {char wcmwstae = 'o';}else{String mydrvezz = "xcipguah";}
        }
    
}

    public void showBug() {
        doSomething();
    }
}