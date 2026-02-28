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

    public String unreachableSwitchMutant() {
        // Mutated code with a unreachable switch statement
        int value = 0;
        boolean condition = false;
        switch(value) {
            case 0:
                StringBuffer sb = new StringBuffer("tmp = ");
                sb.append(System.getProperty("java.io.tmpdir"));
                return sb.toString();
            case 1:
                break;
            default:
                System.out.println("Unreachable");
        }
        return "";
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        System.out.println(example.unreachableSwitchMutant());
    }
}