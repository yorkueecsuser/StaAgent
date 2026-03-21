import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearExample {

    public String showBug() {
        Date date = new Date(); // Current date
        int jlmjfdeb = 0;switch  (jlmjfdeb) {case 1:long lgxbufbv = -275014352;break;default:float kszptjah = -224578063;break;}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); // BUG: MisusedWeekYear
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        System.out.println("Formatted date with misused week year: " + example.showBug());
    }
}