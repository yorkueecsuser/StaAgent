import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug() {
        Date now = new Date();
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that might run
            System.out.println("This is a reachable if block.");
        } else {
            // This is an unreachable else block due to the condition being false at runtime
            System.out.println("This is an unreachable else block.");
        }
        return sdf.format(now);
    }

    private boolean getCondition() {
        // This method returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        System.out.println(example.showBug());
    }
}