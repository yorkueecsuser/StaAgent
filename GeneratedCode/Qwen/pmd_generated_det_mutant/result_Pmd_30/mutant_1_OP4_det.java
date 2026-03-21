import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        if (true && true && true && false && true && true && true && false && true && false && false) {int zxclcsll = 512945269;}else{int cxnudjis = 802215292;}
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