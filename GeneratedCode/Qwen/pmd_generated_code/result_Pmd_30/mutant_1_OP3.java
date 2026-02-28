import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This is another unreachable statement");
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
}