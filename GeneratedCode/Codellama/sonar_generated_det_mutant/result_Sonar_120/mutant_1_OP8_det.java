import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String vojpexbk = "123";
        int rpyfmxqe = calculate(vojpexbk); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(rpyfmxqe);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}