import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Mutated code with unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // This block is also unreachable due to the previous condition
            System.out.println("This is another unreachable block.");
        }
        
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}