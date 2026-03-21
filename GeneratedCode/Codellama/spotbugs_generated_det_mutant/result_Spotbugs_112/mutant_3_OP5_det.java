
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int field) {
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        int dgktxigc = 0;switch  (dgktxigc) {case 1:char auiwwhgf = 'f';break;default:float bmvyatae = -544725308;break;}
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