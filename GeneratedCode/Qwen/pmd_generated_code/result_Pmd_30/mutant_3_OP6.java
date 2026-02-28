import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
            System.out.println("This is an unreachable loop");
        }
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
            System.out.println("This is another unreachable loop");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
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