import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    String result = ref.get().toString();
    String resultCopy = ref.get().toString(); // Duplicate assignment
    return result;
  }

  String badWeakReferenceDereference(WeakReference ref) {
    String result = ref.get().toString();
    String resultCopy = ref.get().toString(); // Duplicate assignment
    return result;
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    String result = ref.get().toString();
    String resultCopy = ref.get().toString(); // Duplicate assignment
    return result;
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    String result = ref.get().toString();
    String resultCopy = ref.get().toString(); // Duplicate assignment
    return result;
  }
}