import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        for  (int tijghbgl = 0; tijghbgl < 0; tijghbgl++) {String ixsiwkvc = "paitkgdw";}
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}