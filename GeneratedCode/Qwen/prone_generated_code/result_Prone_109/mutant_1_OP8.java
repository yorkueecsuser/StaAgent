import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        return sdf.format(date);

        // Mutant code with Renaming mutation operator
        SimpleDateFormat q = new SimpleDateFormat("MM/DD/yyyy");
        Date b = new Date();
        return q.format(b);
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());

        // Mutant code with Renaming mutation operator
        DatePatternBug x = new DatePatternBug();
        System.out.println(x.showBug());
    }
}