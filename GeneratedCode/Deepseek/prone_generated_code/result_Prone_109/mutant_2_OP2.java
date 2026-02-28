import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());

        // Mutant Code:
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        String dateString = sdf.format(new Date());
        System.out.println(dateString);
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}