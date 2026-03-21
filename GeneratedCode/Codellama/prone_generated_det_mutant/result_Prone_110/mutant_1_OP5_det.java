import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        int qrseyqag = 0;switch  (qrseyqag) {case 1:short mzhbkhhx = 6236;break;default:short ubytgtjp = -5166;break;}
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}