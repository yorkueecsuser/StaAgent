import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This should run if shouldRun is true.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else branch.");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This should run if shouldRun is true in showBug2.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else branch in showBug2.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is dynamically determined at runtime
        return false; // This is just a placeholder to simulate a dynamic condition
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