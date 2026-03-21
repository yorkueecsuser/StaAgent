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
        if (false && false && true && false && false && false && true && true && true && true && false) {short yboxbyuj = 9363;}else{byte sfixppox = -39;}
        System.out.println(Arrays.toString(fruits));
    
}
}