import java.util.Arrays;

class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        int i = 0;
        do {
            System.out.println(args[i]);
            i++;
        } while (i < args.length);
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    }
}