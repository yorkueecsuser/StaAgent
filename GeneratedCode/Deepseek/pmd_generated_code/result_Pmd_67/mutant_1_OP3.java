import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        boolean condition = false; // Mutation: Changing the condition to false
        if (condition) { 
            //...
            return null; // BUG: ReturnEmptyCollectionRatherThanNull
        }
        return null;
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