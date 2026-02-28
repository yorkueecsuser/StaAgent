import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        System.out.println(bug.showBug());
        
        //Mutant Code
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-YYYY");
        Date date = new Date();
        String renamedDate = sdf.format(date);
        //End of Mutant Code
    }

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        return sdf.format(new Date());
    }
}