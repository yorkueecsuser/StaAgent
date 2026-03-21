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
    protected void finalize() { int skpiorzs = 0;switch  (skpiorzs) {case 1:byte iebqyzev = -79;break;default:short yipkcbca = -5353;break;}
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