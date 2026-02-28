import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        // Introduced an unreachable for loop with a dynamically determined condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because conditionFor is false
        }
        
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }

    // Method to provide a dynamic condition for the for loop
    private boolean getCondition() {
        return false;
    }
}