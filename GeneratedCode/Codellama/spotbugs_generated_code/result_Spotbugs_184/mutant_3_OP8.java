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

// Mutant 1: Renaming fruits to fruits1
class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] fruits1 = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fruits1));
    }

    public static void showBug() {
        fruits1 = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(fruits1));
    }
}

// Mutant 2: Renaming fruits to fruits2
class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] fruits2 = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fruits2));
    }

    public static void showBug() {
        fruits2 = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(fruits2));
    }
}

// Mutant 3: Renaming fruits to fruits3
class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] fruits3 = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fruits3));
    }

    public static void showBug() {
        fruits3 = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(fruits3));
    }
}