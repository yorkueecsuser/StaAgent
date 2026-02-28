import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code.");
    }
    return ref.get().toString();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}