
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int tjbmldjj) {
        // BUG: MF: Method defines a variable that obscures a tjbmldjj (MF_METHOD_MASKS_FIELD)
        int tjbmldjj = 10;
        // This local variable 'tjbmldjj' hides the class tjbmldjj 'tjbmldjj'
        // and can cause unexpected behavior
        System.out.println(tjbmldjj);
    }

    public int showBug() {
        method(1);
        return field;
    }
}