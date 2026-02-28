import java.time.LocalDate;
import java.util.Random;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        // Dead Store: Inserting unused variable declaration
        int deadStoreVariable;
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100); // Assigning a random value to the dead store variable

        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}