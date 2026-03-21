
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int zuxbcarp) {
        // BUG: MF: Method defines a variable that obscures a zuxbcarp (MF_METHOD_MASKS_FIELD)
        int zuxbcarp = 10;
        // This local variable 'zuxbcarp' hides the class zuxbcarp 'zuxbcarp'
        // and can cause unexpected behavior
        System.out.println(zuxbcarp);
    }

    public int showBug() {
        method(1);
        return field;
    }
}