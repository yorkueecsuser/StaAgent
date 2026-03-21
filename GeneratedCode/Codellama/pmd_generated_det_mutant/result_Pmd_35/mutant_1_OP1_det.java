import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        boolean cfizbtrc = true;
        File sdcardPath = new File("/sdcard");
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}