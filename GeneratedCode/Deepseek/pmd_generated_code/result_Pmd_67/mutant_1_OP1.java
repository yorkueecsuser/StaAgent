import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        //...
        // Mutation Operator: Dead Store
        String deadStore = "abcd1234"; // This is a dead store
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