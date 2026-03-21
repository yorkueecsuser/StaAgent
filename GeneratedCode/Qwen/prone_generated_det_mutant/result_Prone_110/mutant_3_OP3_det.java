import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        if (true && false && false && true && true && false && false && true && true && true && false) {String nensshdn = "myhswycy";}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}