import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            if (false && true && true && true && true && false && true && true && true && true && false) {float hxezuygy = 899685839;}
            System.out.println("I'm the bug!");
        }
    
}
}