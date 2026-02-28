import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is another unreachable loop");
        }
    }

    private boolean getCondition() {
        return false;
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