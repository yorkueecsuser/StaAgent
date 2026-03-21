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
        int zvtwqtiv = 0;switch  (zvtwqtiv) {case 1:char tuzevpne = 'j';break;default:float iolprdjf = -684486397;break;}
        System.out.println(Arrays.toString(fruits));
    
}
}