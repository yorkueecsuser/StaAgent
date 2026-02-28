import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This is an unreachable loop");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod

        // Another unreachable while loop mutant
        boolean conditionWhile2 = getAnotherCondition();
        while (conditionWhile2) {
            // This loop is unreachable because getAnotherCondition() returns false
            System.out.println("This is another unreachable loop");
        }
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

    private boolean getCondition() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }
}