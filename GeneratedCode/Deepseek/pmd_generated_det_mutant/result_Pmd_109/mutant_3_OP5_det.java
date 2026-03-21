import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        int thqtzpjc = 0;switch  (thqtzpjc) {case 1:short jkyaobgh = -6813;break;default:float lmgmrgwg = 489428582;break;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public String showBugCorrected() {
        // BUG: InefficientStringBuffering corrected
        StringBuffer sb = new StringBuffer("tmp = ");
        sb.append(System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
    }
}