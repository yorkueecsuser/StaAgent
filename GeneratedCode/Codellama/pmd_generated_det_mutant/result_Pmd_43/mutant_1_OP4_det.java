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
        if (false && false && true && true && true && true && true && true && true && false && false) {byte cuniqhen = -75;}else{int gmzsvfxa = 155422110;}
        System.gc();
    
}
}