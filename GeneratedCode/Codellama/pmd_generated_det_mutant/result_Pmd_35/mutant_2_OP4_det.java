import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        if (false && true && true && true && false && false && false && true && true && true && false) {String qrrzdkdc = "demxywha";}else{byte omqdqjid = 31;}
        File sdcardPath = new File("/sdcard");
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}