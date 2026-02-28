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

    public void unreachableMutant() {
        boolean condition = false;
        if (condition) {
            // Unreachable code
            StringBuffer sb = new StringBuffer("This code will never be executed");
            sb.toString();
        } else {
            // Reachable code
            StringBuffer sb = new StringBuffer("This code will always be executed");
            sb.toString();
        }
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        example.unreachableMutant();
    }
}