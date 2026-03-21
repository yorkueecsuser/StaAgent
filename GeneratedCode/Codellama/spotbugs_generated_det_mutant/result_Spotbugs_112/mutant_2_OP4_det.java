
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int field) {
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        if (true && false && true && true && false && true && true && true && true && false && false) {double czpxertw = -761839734;}else{byte pobacxgj = 107;}
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