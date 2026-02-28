import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug() {
        Date now = new Date();
        return sdf.format(now);
    }

    // Mutated code with renaming operator
    private SimpleDateFormat xdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showMutant() {
        Date z = new Date();
        return xdf.format(z);
    }

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        System.out.println(example.showBug());
        System.out.println(example.showMutant());
    }
}