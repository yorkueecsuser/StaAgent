import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return Arrays.toString(array);
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();

        // MUTANT CODE: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line should never execute.");
        }

        System.out.println(bug.showBug());
    }
}