import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        String qzjfnrht = "unused"; // Dead Store
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        int xwvtpmnb = 42; // Dead Store
    }

    public static void main(String[] args) {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                System.out.println(Arrays.toString(args));
                boolean rjklmnop = true; // Dead Store
            }
        };

        instance.showBug(new String[]{"a"});
        instance.showBug2();
        double abcdabcd = 3.14; // Dead Store
    }
}