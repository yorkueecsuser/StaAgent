import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());

        // Mutated Code: Unreachable Switch Statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            default:
                System.out.println("This is an unreachable switch statement");
        }
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }

    public static int getUnreachableValue() {
        return 0;  // This ensures that the switch statement will always be unreachable
    }
}