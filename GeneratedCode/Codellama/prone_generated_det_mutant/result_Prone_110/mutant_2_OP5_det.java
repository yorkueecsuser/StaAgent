import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        int blscgfbf = 0;switch  (blscgfbf) {case 1:char aljnokui = 'e';break;default:byte jbqbnzso = 0;break;}
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}