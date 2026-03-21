import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int yebmpokf = 0;switch  (yebmpokf) {case 1:int wkvgqskp = -21387373;break;default:char fodltben = 'a';break;}
        }
    
}
}