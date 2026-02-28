import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());

        // Mutation Operator: Unreachable if statement
        // Unreachable if statement can be created by inserting an if statement with a condition that does not depend on variables or parameters.
        // The following code could be inserted in the showBug() method:

        boolean condition = false;
        if (condition) {
            System.out.println("This line of code will never be executed.");
        }
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());

        // Mutation Operator: Unreachable if statement
        // Unreachable if statement can be created by inserting an if statement with a condition that does not depend on variables or parameters.
        // The following code could be inserted in the showBug() method:

        boolean condition = false;
        if (condition) {
            System.out.println("This line of code will never be executed.");
        }
    }
}