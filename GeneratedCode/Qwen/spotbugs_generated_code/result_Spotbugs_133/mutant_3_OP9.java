import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Introduced an equivalent do-while loop that does nothing
        int i = 0;
        do {
            // This loop does nothing and is just for mutation purposes
        } while (i < 0);

        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}