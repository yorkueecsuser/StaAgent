import java.time.Duration;
import java.time.LocalDate;

class LocalDateBug {
public LocalDate showBug() {
    LocalDate date = LocalDate.now();
    date = LocalDate.now();
    return date.plus(Duration.ofDays(1));
}

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}