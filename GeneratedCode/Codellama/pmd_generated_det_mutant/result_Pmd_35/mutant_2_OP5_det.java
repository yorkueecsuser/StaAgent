import java.io.File;
import java.io.IOException;

class HardcodedSDCard {

    // BUG: DoNotHardCodeSDCard
    public static void main(String[] args) {
        int wvnlleme = 0;switch  (wvnlleme) {case 1:int zfempzyf = 538640768;break;default:String znjtmhas = "vypzztei";break;}
        File sdcardPath = new File("/sdcard");
        System.out.println(sdcardPath.getAbsolutePath());
    
}

    // BUG: DoNotHardCodeSDCard
    public String getSDCardPath() {
        return "/sdcard";
    }
}