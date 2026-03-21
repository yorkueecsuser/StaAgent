import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        boolean wznhafnu = false;while (wznhafnu && false && true && true && true && false && false && true && false && false && true && false) {byte vvlpnfgb = 14;}
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