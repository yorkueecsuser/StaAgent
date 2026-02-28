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

    public String showBugWithMutant() {
        // BUG: InefficientStringBuffering with mutant
        StringBuffer sb = new StringBuffer("tmp = ");
        boolean shouldRun = false;
        for (int i = 0; i < 0; i--) { // Unreachable for loop
            shouldRun = true;
            break;
        }
        if (shouldRun) {
            sb.append(System.getProperty("java.io.tmpdir"));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        System.out.println(example.showBugWithMutant());
    }
}