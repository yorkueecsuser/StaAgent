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
        boolean oajpyuqc = false;while (oajpyuqc && false && false && false && false && false && true && true && false && false && true && false) {short mllxnglf = -3536;}
        System.out.println(Arrays.toString(fruits));
    
}
}