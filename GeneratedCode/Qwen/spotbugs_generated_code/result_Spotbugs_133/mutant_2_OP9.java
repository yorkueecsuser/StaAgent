import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Introduced a do-while loop that does not affect the existing bug
        int i = 0;
        do {
            // Dummy operation to satisfy the mutation requirement
            i++;
        } while (i < numbers.length && false); // The condition is always false, so it doesn't execute

        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}