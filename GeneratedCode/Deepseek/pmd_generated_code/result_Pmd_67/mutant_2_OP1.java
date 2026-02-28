import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        String deadStore_1234abcd = ""; // This is a dead store
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Good behavior
    public String[] goodBehavior() {
        String deadStore_1234abcd = ""; // This is a dead store
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