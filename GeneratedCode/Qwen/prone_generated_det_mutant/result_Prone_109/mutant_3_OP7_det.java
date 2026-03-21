import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        boolean osigmvkw = false;while (osigmvkw && false && true && true && true && false && true && false && true && true && true && false) {String pfnouvrk = "qkoxfdvo";}
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}