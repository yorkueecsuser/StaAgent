import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    }

    // Mutant code: Equivalent do-while loop (although the original code does not contain any loops)
    public void exampleDoWhileLoop() {
        int i = 0;
        do {
            // This loop does not affect the original code or the bug
            System.out.println("This is a do-while loop example: " + i);
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
        bug.exampleDoWhileLoop();
    }
}