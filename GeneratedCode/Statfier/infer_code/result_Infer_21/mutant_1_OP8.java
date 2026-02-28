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

  void callUnannotatedInterfaceBad(UnannotatedInterface x) {
    x.foo();
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface y) {
    s.notThreadSafeOk(y);
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface z) {
    s.notThreadSafeOk(z);
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface a) {
    a.foo();
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod b) {
    b.foo();
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface c) {
    c.foo();
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod d) {
    d.foo();
  }

  public void callUnderLock(AnnotatedInterface e) {
    synchronized (this) {
      e.foo();
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface f) {
    f.foo();
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface g = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(g);
  }

  UnannotatedInterface h;

  private void privateCallOk() {
    h.foo();
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

  void callFromElsewhere(Dispatch i, AnnotatedInterface j) {
    i.callUnderLock(j);
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface k;

  UnannotatedInterface l;

  void interfaceCallOnThreadConfinedFieldOk() {
    k.foo();
  }

  void interfaceCallOnNormalFieldBad() {
    l.foo();
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}