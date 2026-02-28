import java.util.Arrays;

class UselessStringBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (getUnreachableCondition()) {
            // Unreachable if block inserted based on Mutation Operator: Unreachable if statement
            System.out.println("This is unreachable code.");
        }
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        // This bug is maintained, and the correct method Arrays.toString() is not used on purpose.
        return array.toString();
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}