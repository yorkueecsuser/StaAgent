import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
    }

    void showBug2() {
        for  (int rswhuccw = 0; rswhuccw < 0; rswhuccw++) {double mrqnjjvy = 710241546;}
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
    
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