import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean uvurhzds = false;while (uvurhzds && false && false && true && false && true && false && false && false && true && false && false) {int dlipylfv = -400352490;}
        }
    
}

    public static void main(String[] args) {
        EmptyCatchBlockExample example = new EmptyCatchBlockExample();
        example.showBug();
    }
}