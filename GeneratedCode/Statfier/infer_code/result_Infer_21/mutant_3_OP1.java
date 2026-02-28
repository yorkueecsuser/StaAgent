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
    String jxqfjvfn = "deadstore"; // Dead Store mutation
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
    int vbnrhtyq = 42; // Dead Store mutation
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean ztjvbnrf = true; // Dead Store mutation
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    double kxjvbnrf = 3.14; // Dead Store mutation
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
    char wqjvbnrf = 'a'; // Dead Store mutation
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
    long pqjvbnrf = 100L; // Dead Store mutation
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
    float oqjvbnrf = 2.718f; // Dead Store mutation
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
    short uqjvbnrf = 10; // Dead Store mutation
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
      byte tqjvbnrf = 8; // Dead Store mutation
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
    String yqjvbnrf = "mutation"; // Dead Store mutation
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    int rqjvbnrf = 5; // Dead Store mutation
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
    boolean eqjvbnrf = false; // Dead Store mutation
  }

  public void publicCallBad() {
    privateCallOk();
    double gqjvbnrf = 1.618; // Dead Store mutation
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    char dqjvbnrf = 'b'; // Dead Store mutation
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
    long cqjvbnrf = 999L; // Dead Store mutation
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    mThreadConfined.foo();
    float sqjvbnrf = 0.577f; // Dead Store mutation
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
    short hqjvbnrf = 20; // Dead Store mutation
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}