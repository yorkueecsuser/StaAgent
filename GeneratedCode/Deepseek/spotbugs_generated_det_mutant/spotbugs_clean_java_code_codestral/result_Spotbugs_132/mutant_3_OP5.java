import java.util.Arrays;

class UselessStringBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        String arrayString = Arrays.toString(array);

        // Mutation: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (array[0]) {
                case 1:
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }

        return arrayString;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}