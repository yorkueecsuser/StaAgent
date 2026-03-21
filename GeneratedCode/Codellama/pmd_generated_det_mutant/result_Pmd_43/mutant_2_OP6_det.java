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
        for  (int rhyycgok = 0; rhyycgok < 0; rhyycgok++) {String hekdjssm = "vxyfvzeo";}
        list.add(new Object());
        System.gc();
    
}
}