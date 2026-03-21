
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int field) {
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        if (false && false && true && true && false && true && true && false && true && false && false) {short umyhkwhp = 3998;}
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