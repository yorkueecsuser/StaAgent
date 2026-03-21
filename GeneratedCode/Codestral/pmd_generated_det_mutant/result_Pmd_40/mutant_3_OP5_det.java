import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        int hfxrrbnb = 0;switch  (hfxrrbnb) {case 1:String ppnrqlpl = "hfjzqlos";break;default:byte vthlxlix = -125;break;}
        }
    
}
}