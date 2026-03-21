import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int auadzbfs = 0;switch  (auadzbfs) {case 1:long lpkaefsi = -895199315;break;default:short dyktbfyz = 8042;break;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}