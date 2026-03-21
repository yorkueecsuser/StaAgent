import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        int idjcaoea = 0;switch  (idjcaoea) {case 1:double cqducvna = 93982093;break;default:byte zeilabty = 90;break;}
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