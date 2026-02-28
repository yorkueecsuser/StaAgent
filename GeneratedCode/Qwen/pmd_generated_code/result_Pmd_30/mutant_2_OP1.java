import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        String abcdefgh = "unused"; // Dead Store
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        int ijklmnop = 42; // Dead Store
    }

    public static void main(String[] args) {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                System.out.println(Arrays.toString(args));
                boolean qrstuvwx = true; // Dead Store
            }
        };

        instance.showBug(new String[]{"a"});
        instance.showBug2();
    }
}