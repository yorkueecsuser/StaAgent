import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {
public static void main(String [] args){
    LocalDate date = LocalDate.now();
    Period period = Period.ofDays(10);
    LocalDate newDate = date.plus(period);
    newDate = date.plus(period);
    System.out.println(newDate);
}
}