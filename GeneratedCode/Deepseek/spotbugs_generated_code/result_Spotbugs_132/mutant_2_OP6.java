import java.util.Arrays;

class UselessStringBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        String arrayString = Arrays.toString(array);

        // Added unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }

        return arrayString;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}