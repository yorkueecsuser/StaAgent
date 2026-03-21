import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int rgttjjjy = 0; rgttjjjy < 0; rgttjjjy++) {char upqgkgkp = 'l';}
        }
    
}

    public void showBug() {
        doSomething();
    }
}