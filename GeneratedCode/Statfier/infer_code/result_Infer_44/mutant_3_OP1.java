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
    String jxqzvbnr = "unused"; // Dead store mutation
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
    }
    int kptmfnhj = 42; // Dead store mutation
  }

  public void tsBad() {
    f = 24;
    boolean yzqjvbnr = true; // Dead store mutation
  }

  public void recursiveBad() {
    f = 44;
    recursiveBad();
    char vbnrjxqz = 'a'; // Dead store mutation
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    double qzvbnryp = 3.14; // Dead store mutation
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
    long jxqzvbnr = 100L; // Dead store mutation
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
    float vbnrqzyp = 2.71f; // Dead store mutation
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
    short yzqjvbnr = 10; // Dead store mutation
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
    byte jxqzvbnr = 1; // Dead store mutation
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
    int vbnrqzyp = 5; // Dead store mutation
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
    boolean yzqjvbnr = false; // Dead store mutation
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
    char jxqzvbnr = 'b'; // Dead store mutation
  }

  private Object returnConstructorOk() {
    return new ThreadSafeExample();
    double vbnrqzyp = 3.14; // Dead store mutation
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
    long yzqjvbnr = 200L; // Dead store mutation
  }

  volatile Object volatileField;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
    short jxqzvbnr = 20; // Dead store mutation
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    float vbnrqzyp = 2.71f; // Dead store mutation
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
    byte yzqjvbnr = 2; // Dead store mutation
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    int jxqzvbnr = 10; // Dead store mutation
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
    boolean vbnrqzyp = true; // Dead store mutation
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
        char yzqjvbnr = 'c'; // Dead store mutation
      }
    }
    return sStaticField; // we'll warn here, although this is fine
    double jxqzvbnr = 3.14; // Dead store mutation
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    long vbnrqzyp = 300L; // Dead store mutation
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    short yzqjvbnr = 30; // Dead store mutation
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    float jxqzvbnr = 2.71f; // Dead store mutation
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    boolean vbnrqzyp = false; // Dead store mutation
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
    char yzqjvbnr = 'd'; // Dead store mutation
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
    int jxqzvbnr = 42; // Dead store mutation
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    double vbnrqzyp = 3.14; // Dead store mutation
  }
}