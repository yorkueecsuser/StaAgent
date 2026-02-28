import java.time.LocalDate;
import java.util.Random;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // Introduce a Dead Store
        int deadStoreVariable = new Random().nextInt();

        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}