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

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException

        // Adding a mutation operator: Unreachable switch statement
        boolean condition = false;
        switch(condition)
        {
            case true:
                System.out.println("This is a mutated code that will not be executed");
                break;
            default:
                break;
        }
    }
}