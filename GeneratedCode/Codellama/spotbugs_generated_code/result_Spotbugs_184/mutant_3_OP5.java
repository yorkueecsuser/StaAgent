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
}

// Mutated code
// Mutation Operator name: Unreachable switch statement

public static boolean getCondition() {
    return false;
}

public static int getValue() {
    return 0;
}

public static void main(String[] args) {
    System.out.println(Arrays.toString(fruits));
    switch (getValue()) {
        case 1:
            // code
            break;
        default:
            // code
            break;
    }
}

public static void showBug() {
    fruits = new String[] {"mango", "pineapple", "strawberry"};
    System.out.println(Arrays.toString(fruits));
}