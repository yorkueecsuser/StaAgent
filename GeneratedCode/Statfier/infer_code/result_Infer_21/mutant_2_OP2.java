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

  void callUnannotatedInterfaceBad(UnannotatedInterface i) {
    i.foo();
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    s.notThreadSafeOk(i); // Mutation: Duplicate the call
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    privateCallUnnanotatedInterfaceOk(owned); // Mutation: Duplicate the call
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
  }

  public void publicCallBad() {
    privateCallOk();
    privateCallOk(); // Mutation: Duplicate the call
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    privateCallOk(); // Mutation: Duplicate the call
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
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
    mNormal.foo(); // Mutation: Duplicate the call
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}