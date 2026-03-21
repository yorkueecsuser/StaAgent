import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String knkzmxnt = "123";
        int pqhquwpi = calculate(knkzmxnt); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(pqhquwpi);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}