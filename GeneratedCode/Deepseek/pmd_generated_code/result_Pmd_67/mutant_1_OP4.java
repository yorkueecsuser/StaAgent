import java.util.Arrays;

class Example {
    public int[] badBehavior() {
        //...
        // Unreachable if-else statement mutation
        if (false) {
            return new String[0]; // This branch should be unreachable
        } else {
            return null; // Unreachable branch
        }
    }

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
        System.out.println(Arrays.toString(result)); // This will not throw NullPointerException and will print []
    }
}