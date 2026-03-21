import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        boolean uceksvbf = false;while (uceksvbf && true && true && true && true && false && false && false && false && false && false && false) {String rbhadydu = "tnaesyru";}
        System.out.println(bug.showBug());
    
}

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}