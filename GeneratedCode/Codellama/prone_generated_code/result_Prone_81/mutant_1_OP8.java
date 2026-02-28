import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

// Mutant 1: Renaming variable "dateTime" to "lDT"
class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime lDT = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(lDT.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

// Mutant 2: Renaming variable "DateTimeFormatter" to "dtf"
class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

// Mutant 3: Renaming variable "args" to "arguments"
class InvalidJavaTimeConstant {
    public static void main(String[] arguments) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}