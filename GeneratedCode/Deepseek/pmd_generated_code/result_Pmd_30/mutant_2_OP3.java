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
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}
// Unreachable if statement mutation
class UnreachableIfStatementMutant {
    private boolean condition = false;

    public UnreachableIfStatementMutant() {
        if (condition) {
            int x = 1; // Unreachable code
        }
    }

    public void unreachableIfMutant() {
        if (condition) {
            int y = 2; // Unreachable code
        }
    }
}