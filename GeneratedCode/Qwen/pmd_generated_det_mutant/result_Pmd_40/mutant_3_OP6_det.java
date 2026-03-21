import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int evhzmxur = 0; evhzmxur < 0; evhzmxur++) {byte aatysyqp = -7;}
        }
    
}

    public static void main(String[] args) {
        EmptyCatchBlockExample example = new EmptyCatchBlockExample();
        example.showBug();
    }
}