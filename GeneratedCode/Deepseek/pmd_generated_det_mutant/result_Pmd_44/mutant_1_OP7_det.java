import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class FinalizeBug {
    private static ReferenceQueue<Object> refQueue = new ReferenceQueue<>();
    private static PhantomReference<Object> phantomRef;
    private static Object dummyObject = new Object();
    static {
        phantomRef = new PhantomReference<>(dummyObject, refQueue);
        dummyObject = null;
        System.gc();
    }
    protected void finalize() { boolean acobcfhn = false;while (acobcfhn && false && true && false && true && true && false && true && true && true && true && false) {char neasfdel = 'u';}
 // BUG: FinalizeOnlyCallsSuperFinalize
        // super.finalize();
    
}
    public void showBug() {
        System.gc();
        try {
            refQueue.remove();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}