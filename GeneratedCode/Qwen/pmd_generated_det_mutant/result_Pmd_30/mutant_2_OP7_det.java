import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        boolean mznlssjp = false;while (mznlssjp && true && false && false && false && false && true && false && false && false && false && false) {long ukhtnenq = 40208296;}
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
    
}

    void showBug2() {
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