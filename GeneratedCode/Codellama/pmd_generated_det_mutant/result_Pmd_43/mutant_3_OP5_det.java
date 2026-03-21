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
        int vmcosxth = 0;switch  (vmcosxth) {case 1:double shyzvzlb = 994401986;break;default:int tmrbfhep = 512805697;break;}
        list.add(new Object());
        System.gc();
    
}
}