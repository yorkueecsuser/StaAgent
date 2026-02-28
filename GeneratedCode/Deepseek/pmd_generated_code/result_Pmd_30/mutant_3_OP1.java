import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        Object deadStore = new String[] { "a" };  // Inserted dead store here
        varargs(new String[] { "a" });
        varargs(null);
    }

    public void showBug() {
        Object deadStore = new String[] { "a" };  // Inserted dead store here
        varargs(new String[] { "a" });
        varargs(null);
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}