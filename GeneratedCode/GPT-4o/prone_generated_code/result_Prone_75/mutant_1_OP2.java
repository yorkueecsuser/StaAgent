import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
        
        // Duplication mutation operator applied: duplicate the assignments without method invocation
        boolean flag = true; // Original assignment
        boolean flagDuplicate = flag; // Duplicated assignment

        flag = false; // Original assignment
        boolean flagDuplicate2 = flag; // Duplicated assignment
    }
}