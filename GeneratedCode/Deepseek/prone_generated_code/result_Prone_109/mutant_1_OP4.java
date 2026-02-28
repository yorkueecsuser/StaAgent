import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    private boolean condition1 = true;
    private boolean condition2 = true;
    private boolean condition3 = true;

    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());
        if(bug.condition1 == false) {
            System.out.println("Unreachable code");
        }
        else {
            System.out.println("Reachable code");
        }
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        if(condition2 == false) {
            System.out.println("Unreachable code");
        }
        else {
            System.out.println("Reachable code");
        }
        return sdf.format(new Date());
    }

    public boolean getCondition() {
        if(condition3 == false) {
            System.out.println("Unreachable code");
        }
        else {
            System.out.println("Reachable code");
        }
        return true;
    }
}