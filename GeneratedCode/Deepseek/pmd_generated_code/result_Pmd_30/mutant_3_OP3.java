import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod

        // Mutation Operator: Unreachable if statement
        // This code is unreachable because it will never be executed
        if (false) {
            varargs(new String[] { "a" });
            varargs(null);
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);

        // Mutation Operator: Unreachable if statement
        // This code is unreachable because it will never be executed
        boolean shouldRun = false;
        if (shouldRun) {
            varargs(new String[] { "a" });
            varargs(null);
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}