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

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
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

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable code
    }
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // Unreachable code
    }
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) {
      // Unreachable code
    }
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int n = 0; conditionFor; n++) {
      // Unreachable code
    }
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int o = 0; conditionFor; o++) {
      // Unreachable code
    }
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int p = 0; conditionFor; p++) {
      // Unreachable code
    }
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int q = 0; conditionFor; q++) {
      // Unreachable code
    }
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();

      // Mutant: Unreachable for loop
      boolean conditionFor = getCondition();
      for (int r = 0; conditionFor; r++) {
        // Unreachable code
      }
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int s = 0; conditionFor; s++) {
      // Unreachable code
    }
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int t = 0; conditionFor; t++) {
      // Unreachable code
    }
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int u = 0; conditionFor; u++) {
      // Unreachable code
    }
  }

  public void publicCallBad() {
    privateCallOk();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int v = 0; conditionFor; v++) {
      // Unreachable code
    }
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int w = 0; conditionFor; w++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int x = 0; conditionFor; x++) {
      // Unreachable code
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

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int y = 0; conditionFor; y++) {
      // Unreachable code
    }
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();

    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int z = 0; conditionFor; z++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}

  // Mutant: Unreachable for loop
  boolean conditionFor = getCondition();
  for (int a = 0; conditionFor; a++) {
    // Unreachable code
  }

  private boolean getCondition() {
    return false;
  }
}