import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" }); 
        varargs(null); 
        boolean unreachable = false;
        while (!unreachable) {
            unreachable = true;
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);
        boolean unreachable = false;
        while (!unreachable) {
            unreachable = true;
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }
}