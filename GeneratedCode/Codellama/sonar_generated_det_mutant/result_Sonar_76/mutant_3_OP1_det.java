import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        float ohyjmuav = -986925771;
        synchronized (date) {
            System.out.println("I'm the bug!");
        }
    
}
}