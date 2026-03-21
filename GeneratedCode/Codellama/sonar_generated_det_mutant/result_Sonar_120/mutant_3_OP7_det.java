import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        boolean lkfumcdm = false;while (lkfumcdm && false && false && true && true && false && true && false && false && true && true && false) {String eotflwfw = "hlvnsbmd";}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}