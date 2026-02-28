import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Good behavior
    public String[] goodBehavior() {
        //...
        return new String[0];
    }

    // Mutant Code
    public int[] badBehaviorMutant1() {
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    public String[] goodBehaviorMutant1() {
        //...
        return new String[0];
    }

    public int[] showBug() {
        return badBehaviorMutant1();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
    }
}