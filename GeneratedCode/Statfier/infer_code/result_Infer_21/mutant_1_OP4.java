import codetoanalyze.java.annotation.ThreadConfined;
import codetoanalyze.java.annotation.ThreadSafe;

interface UnannotatedInterface {
  public void foo();
}

@ThreadSafe
interface AnnotatedInterface {
  public void foo();
}

interface AnnotatedInterfaceMethod {

  @ThreadSafe
  public void foo();
}

class NotThreadSafe {
  void notThreadSafeOk(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      i.foo(); // ok
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to keep the original code path active
  }
}

@ThreadConfined(ThreadConfined.ANY)
interface ThreadConfinedInterface {
  void foo();
}

interface ThreadConfinedMethod {

  @ThreadConfined(ThreadConfined.ANY)
  void foo();
}

@ThreadSafe
class Dispatch {

  void callUnannotatedInterfaceBad(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      i.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      s.notThreadSafeOk(i);
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      s.notThreadSafeOk(i);
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      i.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      i.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      t.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      t.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        i.foo();
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      i.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      mUnannotated.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  public void publicCallBad() {
    privateCallOk();
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
  }

  private boolean getCondition() {
    return true; // Always returns true to keep the original code path active
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      d.callUnderLock(i);
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to keep the original code path active
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      mThreadConfined.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  void interfaceCallOnNormalFieldBad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      mNormal.foo();
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to keep the original code path active
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}