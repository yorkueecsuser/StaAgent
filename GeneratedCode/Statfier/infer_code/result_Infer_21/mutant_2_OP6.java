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
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // unreachable loop
    }
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
    i.foo();
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // unreachable loop
    }
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // unreachable loop
    }
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) {
      // unreachable loop
    }
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
    boolean conditionFor = getCondition();
    for (int n = 0; conditionFor; n++) {
      // unreachable loop
    }
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
    boolean conditionFor = getCondition();
    for (int o = 0; conditionFor; o++) {
      // unreachable loop
    }
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
    boolean conditionFor = getCondition();
    for (int p = 0; conditionFor; p++) {
      // unreachable loop
    }
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
    boolean conditionFor = getCondition();
    for (int q = 0; conditionFor; q++) {
      // unreachable loop
    }
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
      boolean conditionFor = getCondition();
      for (int r = 0; conditionFor; r++) {
        // unreachable loop
      }
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
    boolean conditionFor = getCondition();
    for (int s = 0; conditionFor; s++) {
      // unreachable loop
    }
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    boolean conditionFor = getCondition();
    for (int t = 0; conditionFor; t++) {
      // unreachable loop
    }
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
    boolean conditionFor = getCondition();
    for (int u = 0; conditionFor; u++) {
      // unreachable loop
    }
  }

  public void publicCallBad() {
    privateCallOk();
    boolean conditionFor = getCondition();
    for (int v = 0; conditionFor; v++) {
      // unreachable loop
    }
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    boolean conditionFor = getCondition();
    for (int w = 0; conditionFor; w++) {
      // unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
    boolean conditionFor = getCondition();
    for (int x = 0; conditionFor; x++) {
      // unreachable loop
    }
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
    mThreadConfined.foo();
    boolean conditionFor = getCondition();
    for (int y = 0; conditionFor; y++) {
      // unreachable loop
    }
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
    boolean conditionFor = getCondition();
    for (int z = 0; conditionFor; z++) {
      // unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}