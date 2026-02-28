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

/*
Mutant 1: Renaming 'dateTime' to 'dt'
 */
class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dt = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

/*
Mutant 2: Renaming 'DateTimeFormatter' to 'dtf'
 */
class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(dtf.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}