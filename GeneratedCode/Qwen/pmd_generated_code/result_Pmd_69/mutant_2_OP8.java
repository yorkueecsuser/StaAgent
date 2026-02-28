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

        // Mutant code
        SimpleDateFormat sda = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date x = new Date();
        String y = sda.format(x);
        System.out.println(y);
    }
}