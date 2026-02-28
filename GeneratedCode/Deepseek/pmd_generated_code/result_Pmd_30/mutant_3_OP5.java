import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
        int value = getValue();
        switch (value) {
            case 1:  
                break;
            default:
                break;
        }
    }

    public void showBug() {
        varargs(new String[] { "a" });
        varargs(null);
        int value = getValue();
        switch (value) {
            case 1:  
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        VarargsBug bug = new VarargsBug();
        bug.showBug();
    }

    private static int getValue() {
        return 0;
    }
}