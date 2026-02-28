import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}

// Mutant code starts here
class InexactVarargsConditionalExampleMutant {

    public static String showBug(boolean b) { // Renamed 'flag' to 'b'
        return Arrays.deepToString(b ? new Object[]{1, 2} : new Object[]{3});
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}
// Mutant code ends here