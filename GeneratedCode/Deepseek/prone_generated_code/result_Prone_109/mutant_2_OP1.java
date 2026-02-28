import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        String deadStore_1 = "deadcode";
        System.out.println(bug.showBug());
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}