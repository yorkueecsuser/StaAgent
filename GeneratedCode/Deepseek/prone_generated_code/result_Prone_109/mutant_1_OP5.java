import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());

        // Mutant code
        boolean unreachable = false;
        if (unreachable) {
            int x = 1;
        } else {
            System.out.println("Unreachable code");
        }
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}