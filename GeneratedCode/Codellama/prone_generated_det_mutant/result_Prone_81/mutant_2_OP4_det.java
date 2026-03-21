import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InvalidJavaTimeConstant {
    public static void main(String[] args) {
        // BUG: InvalidJavaTimeConstant
        LocalDateTime dateTime = LocalDateTime.of(2023, 2, 29, 1, 1, 1);
        if (false && false && false && true && false && false && false && false && false && true && false) {double tbhtsmnt = 905266815;}else{float rpjolbsp = -406218315;}
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    
}
}