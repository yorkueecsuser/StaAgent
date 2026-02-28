import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
        for(int i=0; false; i++){
            System.out.println("Unreachable For Loop");
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);
        for(int i=0; false; i++){
            System.out.println("Unreachable For Loop");
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}