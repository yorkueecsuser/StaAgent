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

    // Mutation of showBug() method
    public String showBugMutant1() {
        // Mutant 1: Unreachable if-else statement
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        if (false) { // Unreachable if-else statement
            sb.append("unreachable");
        } else {
            sb.append("reachable");
        }
        return sb.toString();
    }

    // Mutation of showBugCorrected() method
    public String showBugCorrectedMutant2() {
        // Mutant 2: Unreachable if-else statement
        StringBuffer sb = new StringBuffer("tmp = ");
        sb.append(System.getProperty("java.io.tmpdir"));
        if (false) { // Unreachable if-else statement
            sb.append("unreachable");
        } else {
            sb.append("reachable");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        System.out.println(example.showBugMutant1());
        System.out.println(example.showBugCorrectedMutant2());
    }
}