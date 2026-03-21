import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        boolean xgvsiyie = false;while (xgvsiyie && false && false && false && true && true && true && false && true && true && false && false) {String bevtcwkz = "yjmbufuy";}
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        varargs(null);  // BUG: ConfusingArgumentToVarargsMethod
    
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