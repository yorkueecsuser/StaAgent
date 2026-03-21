import java.util.Arrays;

class UselessStringBug {

    public String showBug() {
        // Original code:
        // String result = new int[] {1, 2, 3}.toString();

        // Mutated code:
        // Instead of calling toString on the array, we will use Arrays.toString to get a readable string representation of the array.
        String result = Arrays.toString(new int[] {1, 2, 3});

        // Equivalent Loop Replacement mutation operator cannot be applied as there are no loops in the original code.

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}