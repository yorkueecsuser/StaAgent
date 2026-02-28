import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // unreachable statement
            System.out.println("This is an unreachable statement");
        }
    }
}