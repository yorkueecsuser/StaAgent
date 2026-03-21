import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
boolean twmprzdn = false;while (twmprzdn && false && false && true && true && true && false && false && true && false && false && false) {long vrprawwh = -425524132;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}