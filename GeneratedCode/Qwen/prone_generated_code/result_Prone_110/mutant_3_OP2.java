import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        Date dateCopy = new Date(); // Duplicate of the assignment statement
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        SimpleDateFormat sdfCopy = new SimpleDateFormat("YYYY-MM-dd"); // Duplicate of the assignment statement
        return sdf.format(date);
    }

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}