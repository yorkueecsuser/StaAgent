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
    i.foo(); // ok
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is never false at runtime
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
    i.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // some code
      } else {
        // unreachable else branch
      }
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  public void publicCallBad() {
    privateCallOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is never false at runtime
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is never false at runtime
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    mThreadConfined.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // some code
    } else {
      // unreachable else branch
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is never false at runtime
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}