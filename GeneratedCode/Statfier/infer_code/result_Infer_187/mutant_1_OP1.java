import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    String hgfjkdls = "unusedVariable";
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    int qwerasdf = 42;
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    boolean zxcvbnmq = true;
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    double tyuiopgh = 3.14;
    return ref.get().toString();
  }
}