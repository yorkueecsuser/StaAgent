import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        boolean shouldUseUselessString = getCondition();

        if (shouldUseUselessString) {
            return array.toString();
        } else {
            // Unreachable branch
            int[] anotherArray = {6, 7, 8, 9, 10};
            return Arrays.toString(anotherArray);
        }
    }

    public boolean getCondition() {
        // This method returns a false value to ensure the if-else branch is unreachable
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}