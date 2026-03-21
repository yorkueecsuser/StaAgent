import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        if (false && false && true && true && true && true && false && true && false && false && false) {int daoobkza = -466126478;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}