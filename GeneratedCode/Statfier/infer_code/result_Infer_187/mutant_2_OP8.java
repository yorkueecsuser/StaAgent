import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    return ref.get().toString();
  }

  // Mutated code
  String badReferenceDereference(Reference a) {
    return a.get().toString();
  }

  String badWeakReferenceDereference(WeakReference b) {
    return b.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference c) {
    return c.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference d) {
    return d.get().toString();
  }
}