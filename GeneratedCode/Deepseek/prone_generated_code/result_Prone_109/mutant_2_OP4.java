import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }

    public void unreachableIfElseMutation() {
        boolean shouldRun = true;
        if (shouldRun) {
            // mutated code
            System.out.println("This code will never be executed");
        } else {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }
}