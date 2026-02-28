import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    // Mutated code with renaming of variable 'date' to 'a'
    public String showBugWithMutant(Date a) {
        return sdf.format(a); // BUG: UnsynchronizedStaticFormatter
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
        // Calling the mutant method
        System.out.println(example.showBugWithMutant(now));
    }
}