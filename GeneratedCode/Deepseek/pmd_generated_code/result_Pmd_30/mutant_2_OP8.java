import java.util.Arrays;

class VarargsBug {
    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // Mutated Code: varargs(new String[] { "a", null });
        varargs(null);  // Mutated Code: varargs(new String[] { "b", "c" });
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