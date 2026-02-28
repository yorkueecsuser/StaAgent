import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is reachable code.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is unreachable code.");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is reachable code in showBug2.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is unreachable code in showBug2.");
        }
    }

    private boolean getCondition() {
        // This method should return a condition that is dynamically determined at runtime
        return false; // Normally, this should be dynamic, but for demonstration, it's set to false
    }

    public static void main(String[] args) {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                System.out.println(Arrays.toString(args));
            }
        };

        instance.showBug(new String[]{"a"});
        instance.showBug2();
    }
}