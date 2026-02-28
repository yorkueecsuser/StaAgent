import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        varargs(array); // DUPLICATION: Duplicate of the above statement
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        varargs(null); // DUPLICATION: Duplicate of the above statement
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