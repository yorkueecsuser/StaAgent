import java.util.Arrays;
import java.util.List;

class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] a = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
    }

    public static void showBug() {
        a = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(a));
    }
}