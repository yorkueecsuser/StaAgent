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
                // This case is unreachable because condition is never true
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method always returns false, making the switch condition dynamically determined
    }
}