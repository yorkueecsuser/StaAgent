import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }

    public void mutation() {
        int unreachableVariable = 0;
        switch (unreachableVariable) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }
    }
}