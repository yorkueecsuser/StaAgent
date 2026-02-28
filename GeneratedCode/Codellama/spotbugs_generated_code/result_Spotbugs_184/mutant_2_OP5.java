import java.util.Arrays;
import java.util.List;

class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] fruits = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fruits));
    }

    public static void showBug() {
        fruits = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(fruits));
    }

    // Unreachable switch statement
    public static void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("Reachable code");
        }
    }
}