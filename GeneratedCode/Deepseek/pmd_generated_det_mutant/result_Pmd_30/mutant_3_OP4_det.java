import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        if (false && true && true && false && true && false && true && true && false && false && false) {double sterpmff = -938743330;}else{float rtxvmwvo = -316917311;}
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