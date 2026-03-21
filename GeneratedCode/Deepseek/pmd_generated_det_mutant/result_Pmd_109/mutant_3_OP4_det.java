import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        if (false && true && false && true && false && false && false && false && true && false && false) {long vohmeynt = -941137173;}else{int gngvyahq = -215495416;}
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