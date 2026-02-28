import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    // Mutated code with renaming of variable 'date' to 'a'
    public String showBugWithMutation(Date a) {
        return sdf.format(a);
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
        // Using the mutated method to demonstrate the mutation
        System.out.println(example.showBugWithMutation(now));
    }
}