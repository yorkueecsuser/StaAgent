import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);
    }

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());

        // Mutant code
        Date a = new Date(); // Current date
        SimpleDateFormat b = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        System.out.println("Mutated formatted date with misused week year: " + b.format(a));
    }
}