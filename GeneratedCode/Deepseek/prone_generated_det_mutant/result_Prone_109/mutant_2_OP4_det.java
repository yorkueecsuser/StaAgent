import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        if (true && false && true && true && false && true && false && false && false && false && false) {boolean eovealfm = false;}else{long vnnlspbx = -830128892;}
        System.out.println(bug.showBug());
    
}

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}