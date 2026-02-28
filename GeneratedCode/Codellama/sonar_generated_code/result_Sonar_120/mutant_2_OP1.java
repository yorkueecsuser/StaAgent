import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input);
        System.out.println(result);
        // Dead Store Mutation Operator
        int zxcvbnm = 10;
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}