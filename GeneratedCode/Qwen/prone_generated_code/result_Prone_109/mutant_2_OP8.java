import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        return sdf.format(date);

        // Mutant code with renaming
        SimpleDateFormat b = new SimpleDateFormat("MM/DD/yyyy");
        Date c = new Date();
        return b.format(c);
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());

        // Mutant code with renaming
        DatePatternBug d = new DatePatternBug();
        System.out.println(d.showBug());
    }
}