import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        } else {
            dateTime = LocalDateTime.of(2023, 2, 28, 1, 1, 1);
        }
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    private static boolean getCondition() {
        // This method will always return true
        return true;
    }
}