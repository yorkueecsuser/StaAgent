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
}

// Mutant 1: Renaming
class Bugs {
    private List<Object> l = new ArrayList<>();

    @Override
    protected void finalize() {
        // BUG: FinalizeDoesNotCallSuperFinalize
        // The finalize() method does not call super.finalize()
        // This is a violation of the Java API specification
        // and can lead to unexpected behavior
        System.out.println("Finalizing...");
        l.clear();
    }

    public void showBug() {
        l.add(new Object());
        System.gc();
    }
}

// Mutant 2: Renaming
class Bugs {
    private List<Object> objects = new ArrayList<>();

    @Override
    protected void finalize() {
        // BUG: FinalizeDoesNotCallSuperFinalize
        // The finalize() method does not call super.finalize()
        // This is a violation of the Java API specification
        // and can lead to unexpected behavior
        System.out.println("Finalizing...");
        objects.clear();
    }

    public void showBug() {
        objects.add(new Object());
        System.gc();
    }
}