import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        File sdcardPath = new File("/sdcard");
        int zwmuqqqq = 0;switch  (zwmuqqqq) {case 1:double apuzbtqq = 23311265;break;default:char chmdnvlr = 'f';break;}
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}