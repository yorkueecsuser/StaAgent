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
  void notThreadSafeOk(UnannotatedInterface x) {
    x.foo(); // ok
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

  void callUnannotatedInterfaceBad(UnannotatedInterface y) {
    y.foo();
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface z) {
    s.notThreadSafeOk(z);
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface w) {
    s.notThreadSafeOk(w);
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface v) {
    v.foo();
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod u) {
    u.foo();
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod r) {
    r.foo();
  }

  public void callUnderLock(AnnotatedInterface q) {
    synchronized (this) {
      q.foo();
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface p) {
    p.foo();
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
  }

  public void publicCallBad() {
    privateCallOk();
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
  }
}

class Some {

  void callFromElsewhere(Dispatch o, AnnotatedInterface n) {
    o.callUnderLock(n);
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    mThreadConfined.foo();
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}