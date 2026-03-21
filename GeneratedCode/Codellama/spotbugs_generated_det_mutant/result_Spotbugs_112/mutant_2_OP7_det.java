
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int field) {
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        boolean ukxhriqs = false;while (ukxhriqs && false && false && true && true && false && true && false && true && true && true && false) {boolean whkefzfm = false;}
        int field = 10;
        // This local variable 'field' hides the class field 'field'
        // and can cause unexpected behavior
        System.out.println(field);
    
}

    public int showBug() {
        method(1);
        return field;
    }
}