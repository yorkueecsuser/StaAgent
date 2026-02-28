import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });
        varargs(new String[] { "a" });  // Mutation: Duplication
        varargs(null);
        varargs(null);  // Mutation: Duplication
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(new String[] { "a" });  // Mutation: Duplication
        varargs(null);
        varargs(null);  // Mutation: Duplication
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}