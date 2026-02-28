import java.util.Arrays;

class Example {
    // Duplicated 'new String[0]' statement
    public int[] badBehavior() {
        //...
        return new String[0]; // Mutant 1: Original duplicated line of code
    }

    // Good behavior
    public String[] goodBehavior() {
        //...
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
    }
}