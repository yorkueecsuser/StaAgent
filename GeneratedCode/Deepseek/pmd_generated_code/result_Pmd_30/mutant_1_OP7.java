import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
        while(false) {
            System.out.println("This is an unreachable while loop");
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);
        while(false) {
            System.out.println("This is an unreachable while loop");
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}