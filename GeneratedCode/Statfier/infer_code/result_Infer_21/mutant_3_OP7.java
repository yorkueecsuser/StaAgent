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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    i.foo(); // ok
  }

  private boolean getCondition() {
    return false;
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    i.foo();
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    s.notThreadSafeOk(i);
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    s.notThreadSafeOk(i);
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    i.foo();
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    i.foo();
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    t.foo();
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    t.foo();
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      i.foo();
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    i.foo();
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    privateCallUnnanotatedInterfaceOk(owned);
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    mUnannotated.foo();
  }

  public void publicCallBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    privateCallOk();
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    privateCallOk();
  }

  private boolean getCondition() {
    return false;
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    d.callUnderLock(i);
  }

  private boolean getCondition() {
    return false;
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    mThreadConfined.foo();
  }

  void interfaceCallOnNormalFieldBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    mNormal.foo();
  }

  private boolean getCondition() {
    return false;
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}