import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY) 

        // Mutated code with renaming
        int[] x = {1, 2, 3, 4, 5};
        return x.toString();
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());

        // Mutated code with renaming
        ArrayToStringBug y = new ArrayToStringBug();
        System.out.println(y.showBug());
    }
}