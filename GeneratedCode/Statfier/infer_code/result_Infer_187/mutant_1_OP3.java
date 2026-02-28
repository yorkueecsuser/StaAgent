import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement for WeakReference.");
    }
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement for PhantomReference.");
    }
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement for AtomicReference.");
    }
    return ref.get().toString();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}