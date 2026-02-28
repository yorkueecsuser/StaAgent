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

    // Unreachable switch statement mutation
    public static void unreachableSwitch() {
        int choice = 0;
        switch (choice) {
            case 0:
                System.out.println("This code is unreachable");
                break;
            case 1:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}