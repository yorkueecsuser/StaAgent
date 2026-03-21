import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        int heyojzhh = 0;switch  (heyojzhh) {case 1:float spepqmcm = -316984176;break;default:double hxeapvbr = -631293807;break;}
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    
}
}