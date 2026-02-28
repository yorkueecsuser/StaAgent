import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    // Mutant code with renaming
    public String showBug(Date x) {
        return sdf.format(x); // BUG: UnsynchronizedStaticFormatter with renamed variable
    }

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}