import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        if (true && true && false && true && true && true && false && false && false && true && false) {short sjntgpgj = 6665;}else{double olxrabvk = 410473933;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}