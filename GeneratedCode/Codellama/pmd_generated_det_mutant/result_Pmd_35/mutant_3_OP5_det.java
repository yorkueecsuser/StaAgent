import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        File sdcardPath = new File("/sdcard");
        int tqrnnupn = 0;switch  (tqrnnupn) {case 1:short ecdfwfho = -35;break;default:short sqdewmfu = -3819;break;}
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}