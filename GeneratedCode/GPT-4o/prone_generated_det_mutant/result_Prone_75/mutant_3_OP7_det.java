import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
boolean jbhqdosa = false;while (jbhqdosa && false && true && false && false && true && false && true && true && true && true && false) {byte cykffjvu = -29;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}