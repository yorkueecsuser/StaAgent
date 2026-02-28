import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        for (int i = 0; false; i++) { }
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
    }

    public void showBug() {
        varargs(new String[] { "a" });
        for (int i = 0; false; i++) { }
        varargs(null);
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}