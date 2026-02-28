import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("Else branch of unreachable code.");
        }

        return result;
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}