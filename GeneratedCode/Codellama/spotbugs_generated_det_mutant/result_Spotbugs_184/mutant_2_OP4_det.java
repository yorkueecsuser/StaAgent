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
        if (false && true && true && false && false && true && false && false && true && true && false) {String hzjieobc = "tjzfqpzt";}else{short umbdkmim = 6497;}
        System.out.println(Arrays.toString(fruits));
    
}
}