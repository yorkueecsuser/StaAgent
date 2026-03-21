import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        short dszftnav = 6599;
        synchronized (date) {
            System.out.println("I'm the bug!");
        }
    
}
}