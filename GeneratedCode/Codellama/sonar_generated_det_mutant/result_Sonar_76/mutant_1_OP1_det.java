import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        double otcaapwu = -546217060;
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            System.out.println("I'm the bug!");
        }
    
}
}