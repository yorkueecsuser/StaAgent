import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public String showBugCorrected() {
        // BUG: InefficientStringBuffering corrected
        StringBuffer sb = new StringBuffer("tmp = ");
        sb.append(System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public String showBugMutant() {
        // BUG: InefficientStringBuffering mutant
        StringBuffer sb = new StringBuffer("tmp = ");
        if (false) {
            sb.append(System.getProperty("java.io.tmpdir"));
        }
        return sb.toString();
    }

    public String showBugMutantCorrected() {
        // BUG: InefficientStringBuffering mutant corrected
        StringBuffer sb = new StringBuffer("tmp = ");
        boolean condition = false;
        if (condition) {
            sb.append(System.getProperty("java.io.tmpdir"));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        System.out.println(example.showBugMutant());
        System.out.println(example.showBugMutantCorrected());
    }
}