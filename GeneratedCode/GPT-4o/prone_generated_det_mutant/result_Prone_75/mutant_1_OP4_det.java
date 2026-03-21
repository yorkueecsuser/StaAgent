import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
if (false && true && false && true && false && true && false && false && true && true && false) {int eskzckug = -924163498;}else{long rwollaer = -164424423;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}