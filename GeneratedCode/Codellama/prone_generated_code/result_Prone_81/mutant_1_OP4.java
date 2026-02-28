import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Mutation Operator: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable branch");
        } else {
            System.out.println("Unreachable branch");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}