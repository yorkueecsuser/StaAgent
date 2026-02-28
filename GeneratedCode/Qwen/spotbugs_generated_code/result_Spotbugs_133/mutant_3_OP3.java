import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Introduced an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
        
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}