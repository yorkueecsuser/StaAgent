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

    // Mutant code start
    public void mutant_renaming_1() {
        int[] renamedArray = showBug();
        System.out.println(Arrays.toString(renamedArray));
    }
    // Mutant code end

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
        example.mutant_renaming_1(); // Mutant code invocation
    }
}