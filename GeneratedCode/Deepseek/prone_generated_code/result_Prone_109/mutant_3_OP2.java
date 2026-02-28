import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());
        // Duplicated code
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        System.out.println(sdf.format(new Date()));
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}