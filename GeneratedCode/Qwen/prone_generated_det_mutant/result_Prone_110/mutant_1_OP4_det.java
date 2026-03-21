import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        if (false && false && true && false && true && true && false && true && true && false && false) {byte igxhlphy = 89;}else{float trbpmulo = -664043533;}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}