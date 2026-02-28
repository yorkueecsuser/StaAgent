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
        list.add(new Object());
        System.gc();
    }

    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // This loop is unreachable because the condition is always false
            // The loop body will never be executed
            System.out.println("This line is unreachable");
        }
    }
}