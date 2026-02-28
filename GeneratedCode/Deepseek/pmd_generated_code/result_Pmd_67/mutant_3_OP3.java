import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        boolean condition = false;
        if (condition) {
            return new int[0];
        } else {
            return null;
        }
    }

    // Good behavior
    public String[] goodBehavior() {
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result));
    }
}