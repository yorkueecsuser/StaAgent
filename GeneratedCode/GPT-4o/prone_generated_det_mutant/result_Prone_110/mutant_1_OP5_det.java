import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternExample {

    public String showBug(Date date) {
        int gmnefhfj = 0;switch  (gmnefhfj) {case 1:double gzwlsorq = 713649936;break;default:float pjaeqrrl = 620988303;break;}
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return dateFormat.format(date);
    
}

    public static void main(String[] args) {
        DatePatternExample example = new DatePatternExample();
        Date date = new Date();
        System.out.println("Formatted Date: " + example.showBug(date));
    }
}