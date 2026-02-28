import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
        if (false) {  // Unreachable if-else statement mutation
            System.out.println("This branch will never be executed.");
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);
        if (false) {  // Unreachable if-else statement mutation
            System.out.println("This branch will never be executed.");
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}