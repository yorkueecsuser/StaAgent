import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        if (false && true && true && true && false && true && false && true && false && true && false) {boolean ipmgkhkr = false;}else{int xmwgvswm = -785937069;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}