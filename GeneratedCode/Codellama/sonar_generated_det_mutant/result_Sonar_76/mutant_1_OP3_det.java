import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            if (false && true && false && false && false && true && true && false && false && false && false) {boolean dqwqikod = false;}
            System.out.println("I'm the bug!");
        }
    
}
}