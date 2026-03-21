import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        if (true && false && true && false && true && true && true && false && false && true && false) {float gyjmsszg = 422919066;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}