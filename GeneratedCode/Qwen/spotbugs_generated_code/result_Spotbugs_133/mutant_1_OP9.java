import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Introducing a dummy loop to apply the mutation operator
        int i = 0;
        while (i < 0) { // This loop will never execute
            i++;
        }
        
        // Equivalent do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 0); // This loop will also never execute
        
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}