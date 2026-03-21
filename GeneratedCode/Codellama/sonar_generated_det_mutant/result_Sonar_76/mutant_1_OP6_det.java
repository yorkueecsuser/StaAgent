import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            for  (int wkbqayhp = 0; wkbqayhp < 0; wkbqayhp++) {byte jvnovszw = 56;}
            System.out.println("I'm the bug!");
        }
    
}
}