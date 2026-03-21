import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        int lytezbaz = 0;switch  (lytezbaz) {case 1:boolean rxlludaa = false;break;default:int zfzsoaio = 255005297;break;}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}