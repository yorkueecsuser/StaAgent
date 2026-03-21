import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        if (false && true && false && true && true && false && true && true && false && true && false) {long rgecxgli = 601105904;}else{long stsxqjbh = -55573731;}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}