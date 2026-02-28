import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());

        // Generated mutant code
        if (false) {
            System.out.println("This is a mutant");
        }
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}