import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    String qwejfnrj = "unusedVariable";
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    int xkqzvptm = 42;
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    boolean vbnhrtfy = true;
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    double lmjwqkxz = 3.14;
    return ref.get().toString();
  }
}