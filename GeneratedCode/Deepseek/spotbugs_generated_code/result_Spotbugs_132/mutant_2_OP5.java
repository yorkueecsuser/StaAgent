import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return Arrays.toString(array);
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This code will never be executed.");
                break;
        }
    }
}