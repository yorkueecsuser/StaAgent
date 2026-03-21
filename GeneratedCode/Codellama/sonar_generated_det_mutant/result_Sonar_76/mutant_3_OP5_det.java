import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            int ldamgrus = 0;switch  (ldamgrus) {case 1:short rjczyosa = -7890;break;default:byte rbsihdvc = -110;break;}
            System.out.println("I'm the bug!");
        }
    
}
}