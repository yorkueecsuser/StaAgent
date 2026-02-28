import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());
    }

    public String showBug() {
        SimpleDateFormat sdfRenamed = new SimpleDateFormat("MM-DD-yyyy");
        return sdfRenamed.format(new Date());
    }
}