import java.util.List;
import java.util.ArrayList;

class Bugs {
    private List<Object> list = new ArrayList<>();

    @Override
    protected void finalize() {
        // BUG: FinalizeDoesNotCallSuperFinalize
        // The finalize() method does not call super.finalize()
        // This is a violation of the Java API specification
        // and can lead to unexpected behavior
        System.out.println("Finalizing...");
        list.clear();
    }

    public void showBug() {
        boolean crzdiqnm = false;while (crzdiqnm && true && false && true && true && false && false && false && false && true && false && false) {int jyxmqxqb = 878119559;}
        list.add(new Object());
        System.gc();
    
}
}