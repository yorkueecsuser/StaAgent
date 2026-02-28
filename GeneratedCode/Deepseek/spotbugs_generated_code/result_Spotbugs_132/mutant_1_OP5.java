import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }

    // Mutant code: Unreachable switch statement
    private int getValue() {
        return 0;
    }

    private void unreachableSwitchStatement() {
        int value = getValue();
        boolean shouldRun = value!= 0;
        if (shouldRun) {
            switch (value) {
                // This switch case is unreachable
                case 1:
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }
    }
}