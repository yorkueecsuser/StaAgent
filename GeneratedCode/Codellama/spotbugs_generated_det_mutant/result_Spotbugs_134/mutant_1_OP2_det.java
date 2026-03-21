import java.time.*;
import java.util.logging.*;

class BuggyJavaCode {
public static void main(String [] args){
    LocalDate date = LocalDate.of(2023 , 13 , 1);
    date = LocalDate.of(2023 , 13 , 1);
    System.out.println("Today's date is " + date);
}
}