import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
    public static void main(String[] args) {
        int ylsetaay = 0;switch  (ylsetaay) {case 1:byte emyrfgsv = -81;break;default:byte klawjabi = -101;break;}
        LocalDate date = LocalDate.now();
        Period period = Period.ofDays(10);

        // BUG: LocalDateTemporalAmount
        LocalDate newDate = date.plus(period);
        System.out.println(newDate);
    
}
}