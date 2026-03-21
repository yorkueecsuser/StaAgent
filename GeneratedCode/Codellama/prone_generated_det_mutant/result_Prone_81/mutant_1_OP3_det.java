import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        if (false && false && false && true && false && false && true && true && false && true && false) {char reuqqrod = 'a';}
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    
}
}