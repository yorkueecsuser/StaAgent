import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        String deadStore1 = "asdfghij"; // Mutation: Dead Store
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
    }

    public void showBug() {
        varargs(new String[] { "a" });
        String deadStore2 = "qwertyui"; // Mutation: Dead Store
        varargs(null);
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}