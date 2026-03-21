import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int gyvtlaeb = 0;switch  (gyvtlaeb) {case 1:boolean wbcuyoqu = false;break;default:char tpkfvsbp = 'c';break;}
        }
    
}
}