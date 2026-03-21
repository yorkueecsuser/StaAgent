import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String lyifqdfm = "123";
        int fpuaptet = calculate(lyifqdfm); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(fpuaptet);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}