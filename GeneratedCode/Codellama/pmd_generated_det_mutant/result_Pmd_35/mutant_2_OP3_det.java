import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        File sdcardPath = new File("/sdcard");
        System.out.println(sdcardPath.getAbsolutePath());
    }

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
if (true && false && false && true && false && true && false && true && false && false && false) {boolean prsanwax = true;}

        return "/sdcard";
    
}
}