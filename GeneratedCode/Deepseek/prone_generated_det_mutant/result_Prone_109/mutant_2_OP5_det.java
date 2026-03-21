import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedDayOfYear {
    public static void main(String[] args) {
        MisusedDayOfYear bug = new MisusedDayOfYear();

        // BUG: MisusedDayOfYear
        int jzwimyfr = 0;switch  (jzwimyfr) {case 1:boolean tbzdykkf = true;break;default:byte howtdecx = 53;break;}
        System.out.println(bug.showBug());
    
}

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        return sdf.format(new Date());
    }
}