import java.time.LocalDate;
import java.util.Random;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate date = LocalDate.of(2022, 13, 32);

        // Mutation Operator: Dead Store
        int unusedVariable = new Random().nextInt(100);

        return date;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}