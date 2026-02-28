import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class LibraryCalls {

  String badReferenceDereference(Reference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code that does not affect the logic
      System.out.println("This is a placeholder");
    } else {
      // Unreachable else block
      return "Unreachable";
    }
    return ref.get().toString();
  }

  String badWeakReferenceDereference(WeakReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code that does not affect the logic
      System.out.println("This is a placeholder");
    } else {
      // Unreachable else block
      return "Unreachable";
    }
    return ref.get().toString();
  }

  String badPhantomReferenceDereference(PhantomReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code that does not affect the logic
      System.out.println("This is a placeholder");
    } else {
      // Unreachable else block
      return "Unreachable";
    }
    return ref.get().toString();
  }

  String badAtomicReferenceDereference(AtomicReference ref) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code that does not affect the logic
      System.out.println("This is a placeholder");
    } else {
      // Unreachable else block
      return "Unreachable";
    }
    return ref.get().toString();
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the else block is unreachable
    return false;
  }
}