import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                /* code */
                break;
            default:
                /* alternative code */
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}