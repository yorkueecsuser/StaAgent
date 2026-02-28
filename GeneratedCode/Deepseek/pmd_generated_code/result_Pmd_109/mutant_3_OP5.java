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

    public String showUnreachableSwitchStatement() {
        // Mutant: Unreachable switch statement
        StringBuffer sb = new StringBuffer("tmp = ");
        int unreachableValue = 0;
        switch(unreachableValue) {
            case 1:
                sb.append("unreachableCode");
                break;
            default:
                break;
        }
        sb.append(System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        System.out.println(example.showUnreachableSwitchStatement());
    }
}