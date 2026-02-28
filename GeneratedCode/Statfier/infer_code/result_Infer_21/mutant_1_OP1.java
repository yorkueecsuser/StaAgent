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
    String qzjxflrt = "deadstore"; // Dead Store mutation
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
    int abcdabcd = 42; // Dead Store mutation
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean efghijkl = true; // Dead Store mutation
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    double mnopqrst = 3.14; // Dead Store mutation
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
    char uvwxyzab = 'a'; // Dead Store mutation
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
    long cdefghij = 100L; // Dead Store mutation
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
    float klmnopqr = 2.718f; // Dead Store mutation
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
    short stuvwxyz = 10; // Dead Store mutation
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
      byte abcdefgh = 1; // Dead Store mutation
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
    char ijklmnop = 'b'; // Dead Store mutation
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    short qrstuvwx = 20; // Dead Store mutation
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
    int yzabcdef = 50; // Dead Store mutation
  }

  public void publicCallBad() {
    privateCallOk();
    long ghijklmn = 60L; // Dead Store mutation
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    double opqrstuv = 7.0; // Dead Store mutation
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
    boolean wxyzabcd = false; // Dead Store mutation
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    mThreadConfined.foo();
    String cdefghij = "anotherdeadstore"; // Dead Store mutation
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
    float klmnopqr = 1.618f; // Dead Store mutation
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}