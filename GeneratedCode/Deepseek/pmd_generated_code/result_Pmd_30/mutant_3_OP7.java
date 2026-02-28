import java.util.Arrays;

class VarargsBug {
    public static void varargs(Object... parm) {
        while (false) {
            System.out.println("This is an unreachable while loop");
        }
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
        while (false) {
            System.out.println("This is an unreachable while loop");
        }
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}