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
        list.clear(); // Mutant: Duplicated statement to clear list
    }

    public void showBug() {
        list.add(new Object());
        System.gc();
        list.add(new Object()); // Mutant: Duplicated statement to add object to list
    }
}