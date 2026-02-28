import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY) 

        // Mutated code
        int[] z = {6, 7, 8, 9, 10};
        return z.toString(); // Additional mutant line, still contains the bug
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());

        // Mutated code
        ArrayToStringBug x = new ArrayToStringBug();
        System.out.println(x.showBug()); // Additional mutant line, does not introduce new bug
    }
}