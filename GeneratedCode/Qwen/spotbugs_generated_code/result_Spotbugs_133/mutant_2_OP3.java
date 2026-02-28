import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean condition = getCondition(); // Non-final variable to avoid unreachable if statement
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block");
        }
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}