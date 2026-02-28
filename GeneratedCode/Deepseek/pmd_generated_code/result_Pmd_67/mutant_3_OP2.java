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

    public int[] showBug() {
        return badBehavior();
    }

    // Mutant Code
    public int[] badBehaviorMutant() {
        return null; // Mutant for bug ReturnEmptyCollectionRatherThanNull
    }

    public String[] goodBehaviorMutant() {
        return new String[0];
    }

    public int[] showBugMutant() {
        return badBehaviorMutant();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBugMutant();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
    }
}