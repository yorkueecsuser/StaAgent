import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }

    // Begin Mutant Code
    public static void showBug3() {
        // This is a renamed method from showBug1, demonstrating renaming mutation
        varargsMethod(new String[]{"b"}); // Different argument to ensure uniqueness
    }

    public static void mainMutant(String[] y) { // Renamed 'args' to 'y'
        showBug1();
        showBug2();
        showBug3(); // Adding the call to the new unique method
    }
    // End Mutant Code
}