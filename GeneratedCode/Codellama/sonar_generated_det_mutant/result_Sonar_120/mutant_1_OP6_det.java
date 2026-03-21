import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        for  (int vucgpqrv = 0; vucgpqrv < 0; vucgpqrv++) {long zeqpqjbs = 584119104;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}