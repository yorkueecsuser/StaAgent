import java.time.LocalDate;
import java.time.temporal.ChronoField;

class TemporalAccessorBug {
public Integer showBug() {
    LocalDate date = LocalDate.now();
    date = LocalDate.now();
    return date.get(ChronoField.DAY_OF_MONTH);
}

    public static void main(String[] args) {
        TemporalAccessorBug bug = new TemporalAccessorBug();
        try {
            System.out.println(bug.showBug());
        } catch (java.time.DateTimeException e) {
            System.out.println("Bug occurred: " + e.getMessage());
        }
    }
}