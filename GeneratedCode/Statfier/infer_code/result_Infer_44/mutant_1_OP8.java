import codetoanalyze.java.annotation.ThreadSafe;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.concurrent.NotThreadSafe;

@ThreadSafe
class ThreadSafeExample {

  /*Included to make sure infer does not report on class initializers*/
  static Class<?> A = ThreadSafeExample.class;

  Integer f;

  public ThreadSafeExample() {
    f = 86;
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
    }
  }

  public void tsBad() {
    f = 24;
  }

  public void recursiveBad() {
    f = 44;
    recursiveBad();
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
  }

  private Object returnConstructorOk() {
    return new ThreadSafeExample();
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
  }

  volatile Object volatileField;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
      }
    }
    return sStaticField; // we'll warn here, although this is fine
  }

  // Mutant code
  Integer x;

  public ThreadSafeExample() {
    f = 86;
    x = 0; // Added mutant variable
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
      x = 1; // Added mutant variable
    }
  }

  public void tsBad() {
    f = 24;
    x = 2; // Added mutant variable
  }

  public void recursiveBad() {
    f = 44;
    x = 3; // Added mutant variable
    recursiveBad();
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    x = 4; // Added mutant variable
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
    x = 5; // Added mutant variable
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
    x = 6; // Added mutant variable
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
    x = 7; // Added mutant variable
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
    x = 8; // Added mutant variable
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
    x = 9; // Added mutant variable
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
    x = 10; // Added mutant variable
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
    x = 11; // Added mutant variable
  }

  private Object returnConstructorOk() {
    x = 12; // Added mutant variable
    return new ThreadSafeExample();
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
    x = 13; // Added mutant variable
  }

  volatile Object y;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
    y = new Object(); // Added mutant variable
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    y = new Object(); // Added mutant variable
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
    y = new Object(); // Added mutant variable
  }

  Object z;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    z = new Object(); // Added mutant variable
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
    z = new Object(); // Added mutant variable
  }

  Object w;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
      }
    }
    return sStaticField; // we'll warn here, although this is fine
    w = new Object(); // Added mutant variable
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    x = 14; // Added mutant variable
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    x = 15; // Added mutant variable
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    x = 16; // Added mutant variable
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    x = 17; // Added mutant variable
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
    x = 18; // Added mutant variable
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
    x = 19; // Added mutant variable
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    x = 20; // Added mutant variable
  }
}