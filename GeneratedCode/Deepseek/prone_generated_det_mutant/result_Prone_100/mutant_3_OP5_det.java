import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        int fondakfd = 0;switch  (fondakfd) {case 1:String vqlbqojx = "uhkmulqy";break;default:int aufqlbfw = 168146293;break;}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}