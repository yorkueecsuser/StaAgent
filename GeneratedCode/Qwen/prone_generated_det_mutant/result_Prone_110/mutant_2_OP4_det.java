import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        if (true && true && false && false && true && false && true && true && true && false && false) {float wqutfawf = 645854009;}else{float iuxhgvsp = -867717083;}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}