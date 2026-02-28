import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // This block is intentionally left empty to make the if statement unreachable
        }
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    private boolean getCondition() {
        // This method returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}