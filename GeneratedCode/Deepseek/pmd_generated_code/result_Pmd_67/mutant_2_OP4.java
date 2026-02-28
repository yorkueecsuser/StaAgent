import java.util.Arrays;

class Example {
    boolean condition = false; // Added line

    // Not a good idea...
    public int[] badBehavior() {
        if (condition) { // Added new unreachable if statement
            return new int[0];
        }
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
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