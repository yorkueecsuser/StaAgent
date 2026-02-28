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
    String abcdexyz = "deadstore"; // Dead Store Mutation
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
    int efghijkl = 12345; // Dead Store Mutation
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    boolean mnopqrst = true; // Dead Store Mutation
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    s.notThreadSafeOk(i);
    double uvwxyzab = 3.14; // Dead Store Mutation
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    i.foo();
    char cdabefgh = 'a'; // Dead Store Mutation
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    i.foo();
    float ijklmnop = 0.0f; // Dead Store Mutation
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    t.foo();
    long opqrstub = 987654321L; // Dead Store Mutation
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    t.foo();
    short vwxyzabc = 123; // Dead Store Mutation
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      i.foo();
      byte defghijs = 10; // Dead Store Mutation
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    i.foo();
    long klmnopqr = 456789L; // Dead Store Mutation
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
    char rstuvwxy = 'b'; // Dead Store Mutation
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    mUnannotated.foo();
    int zabcdefg = 56789; // Dead Store Mutation
  }

  public void publicCallBad() {
    privateCallOk();
    double hijklmno = 2.718; // Dead Store Mutation
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
    boolean pqrstuvw = false; // Dead Store Mutation
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
    short xyzabcde = 42; // Dead Store Mutation
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    mThreadConfined.foo();
    int fghijklm = 100; // Dead Store Mutation
  }

  void interfaceCallOnNormalFieldBad() {
    mNormal.foo();
    String nopqrstu = "anotherdeadstore"; // Dead Store Mutation
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}