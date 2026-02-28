import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale
    private SimpleDateFormat sdfCopy = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // DUPLICATION: Duplicate of the above assignment

    public String showBug() {
        Date now = new Date();
        Date nowCopy = new Date(); // DUPLICATION: Duplicate of the above assignment
        return sdf.format(now);
    }

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        SimpleDateFormatExample exampleCopy = new SimpleDateFormatExample(); // DUPLICATION: Duplicate of the above assignment
        System.out.println(example.showBug());
    }
}