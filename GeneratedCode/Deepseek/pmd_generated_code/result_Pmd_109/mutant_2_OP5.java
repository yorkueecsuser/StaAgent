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

    public void unreachableSwitchStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value;
            switch (value = getValue()) {
                case 1:
                    System.out.println("Unreachable Switch Statement");
                    break;
                default:
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 2;
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        example.unreachableSwitchStatement();
    }
}