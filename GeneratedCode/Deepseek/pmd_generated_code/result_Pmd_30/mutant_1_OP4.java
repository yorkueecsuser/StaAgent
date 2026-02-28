import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);

        // Added mutant code
        boolean shouldRun = false;
        if (shouldRun) {
            // code
        } else {
            // code
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}