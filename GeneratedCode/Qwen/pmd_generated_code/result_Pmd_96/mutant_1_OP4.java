import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block can be executed if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block.");
        }
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    private boolean getCondition() {
        // Always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}