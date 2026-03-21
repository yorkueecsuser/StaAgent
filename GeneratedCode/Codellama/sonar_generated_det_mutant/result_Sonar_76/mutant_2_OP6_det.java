import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            System.out.println("I'm the bug!");
        for  (int nxeckadw = 0; nxeckadw < 0; nxeckadw++) {boolean serwyoqu = true;}
        }
    
}
}