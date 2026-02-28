import java.util.Arrays;

abstract class C {
    abstract void varargs(Object... args);

    void showBug(String[] array) {
        varargs(array); // BUG: ConfusingArgumentToVarargsMethod
        // Mutant: Renaming 'array' to 'b'
        String[] b = array;
        varargs(b);
    }

    void showBug2() {
        varargs(null); // BUG: ConfusingArgumentToVarargsMethod
        // Mutant: Renaming 'null' to 'n' (though null is a keyword, we rename the method parameter conceptually)
        Object n = null;
        varargs((Object) n);
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
        // Mutant: Renaming 'instance' to 'i'
        C i = instance;
        i.showBug(new String[]{"a"});
        i.showBug2();
    }
}