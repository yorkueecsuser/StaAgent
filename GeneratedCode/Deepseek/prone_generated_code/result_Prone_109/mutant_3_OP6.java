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

    //Mutant Code
    public void unreachableCodeForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This code is unreachable!");
        }
    }
}