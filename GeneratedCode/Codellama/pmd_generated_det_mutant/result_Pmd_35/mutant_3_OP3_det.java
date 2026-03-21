import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        if (false && true && true && false && false && true && false && true && false && false && false) {double uwpyixjo = 603890156;}
        File sdcardPath = new File("/sdcard");
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}