import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        boolean wgzpxgge = false;while (wgzpxgge && true && false && false && false && false && false && true && true && false && true && false) {boolean robcsmgl = false;}
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}