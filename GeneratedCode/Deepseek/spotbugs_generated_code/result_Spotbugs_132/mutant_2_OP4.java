import java.util.Arrays;

class UselessStringBug {
    public static boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        String arrayString = Arrays.toString(array);

        // Mutated code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            arrayString = "Unreachable code";
        } else {
            int x = 10; // Some code that will not be executed
        }

        return arrayString;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}