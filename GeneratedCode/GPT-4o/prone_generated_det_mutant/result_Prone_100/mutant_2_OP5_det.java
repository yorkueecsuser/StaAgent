import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        int qofelexr = 0;switch  (qofelexr) {case 1:double akvoymyh = 993997392;break;default:String fradliig = "cdarknjz";break;}
        Duration duration = Duration.ofDays(daysToAdd);
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    
}

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}