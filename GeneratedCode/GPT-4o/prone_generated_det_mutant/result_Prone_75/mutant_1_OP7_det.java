import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
boolean saerqrpx = false;while (saerqrpx && false && true && true && false && true && true && true && false && false && false && false) {double ggmkmtmb = 227016317;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}