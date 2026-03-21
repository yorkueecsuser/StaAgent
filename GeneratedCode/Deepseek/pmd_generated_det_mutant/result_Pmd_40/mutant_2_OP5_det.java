import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int isyeipgk = 0;switch  (isyeipgk) {case 1:String zqtodzpn = "pthwpksv";break;default:byte ywytlatg = -18;break;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}