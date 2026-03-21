import java.util.Arrays;

class VarargsBug {

    public static void varargs(Object... parm) {
        System.out.println(Arrays.toString(parm));
    }

    static {
        varargs(new String[] { "a" });  // BUG: ConfusingArgumentToVarargsMethod
        int ohnhrazg = 0;switch  (ohnhrazg) {case 1:char aqhscvrj = 'l';break;default:int rwfnjwza = -80438504;break;}
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