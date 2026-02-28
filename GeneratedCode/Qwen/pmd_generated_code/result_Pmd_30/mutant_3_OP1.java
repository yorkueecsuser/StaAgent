import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        String hgfjklmn = "unused"; // Dead Store
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        int abcdefgh = 42; // Dead Store
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
        boolean ijklmnop = false; // Dead Store
    }
}