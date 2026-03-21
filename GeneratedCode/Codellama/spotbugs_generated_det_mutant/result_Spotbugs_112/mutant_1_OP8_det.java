
import java.util.List;

class BuggyClass {
    private int field;

    public void method(int wsyszvci) {
        // BUG: MF: Method defines a variable that obscures a wsyszvci (MF_METHOD_MASKS_FIELD)
        int wsyszvci = 10;
        // This local variable 'wsyszvci' hides the class wsyszvci 'wsyszvci'
        // and can cause unexpected behavior
        System.out.println(wsyszvci);
    }

    public int showBug() {
        method(1);
        return field;
    }
}