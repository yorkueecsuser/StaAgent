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
    f = 86; // Mutant: Duplicate assignment
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
      f = 42; // Mutant: Duplicate assignment
    }
  }

  public void tsBad() {
    f = 24;
    f = 24; // Mutant: Duplicate assignment
  }

  public void recursiveBad() {
    f = 44;
    f = 44; // Mutant: Duplicate assignment
    recursiveBad();
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    f = 24; // Mutant: Duplicate assignment
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
    this.volatileField = new Object(); // Mutant: Duplicate assignment
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    this.f = 47; // Mutant: Duplicate assignment
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    this.sharedField = new Object(); // Mutant: Duplicate assignment
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
        sStaticField = new Object(); // Mutant: Duplicate assignment
      }
    }
    return sStaticField; // we'll warn here, although this is fine
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    field = 22; // Mutant: Duplicate assignment
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    field = 44; // Mutant: Duplicate assignment
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    field = 22; // Mutant: Duplicate assignment
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    subsubfield = 22; // Mutant: Duplicate assignment
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    this.mField = 1; // Mutant: Duplicate assignment
  }
}