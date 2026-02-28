import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug() {
        Date now = new Date();
        return sdf.format(now);
    }

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        System.out.println(example.showBug());

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to ensure the switch is not empty
                break;
        }
    }

    // Method to provide a dynamic condition that always returns false
    private static boolean getCondition() {
        return false;
    }
}