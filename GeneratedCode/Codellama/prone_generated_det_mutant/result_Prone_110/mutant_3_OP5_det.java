import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        int tstzeytq = 0;switch  (tstzeytq) {case 1:boolean uqbrrdqy = false;break;default:byte yinurqya = 20;break;}
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear
    
}
}