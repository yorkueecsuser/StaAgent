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
    String qzjxvbnr = "unused"; // Dead Store
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
    }
    int xwvfrtgb = 0; // Dead Store
  }

  public void tsBad() {
    f = 24;
    boolean cvbhnjmk = false; // Dead Store
  }

  public void recursiveBad() {
    f = 44;
    recursiveBad();
    char yuiopasd = 'a'; // Dead Store
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    double lkjhgfds = 0.0; // Dead Store
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
    float poiuytrew = 0.0f; // Dead Store
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
    long mnbvcxz = 0L; // Dead Store
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
    short asdfghjk = 0; // Dead Store
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
    byte zxcvbnml = 0; // Dead Store
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
    int qwertyui = 0; // Dead Store
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
    long poiuytrewq = 0L; // Dead Store
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
    boolean lkjhgfdsa = false; // Dead Store
  }

  private Object returnConstructorOk() {
    return new ThreadSafeExample();
    char poiuymnbv = 'a'; // Dead Store
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
    double lkjhgfdsa = 0.0; // Dead Store
  }

  volatile Object volatileField;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
    float mnbvcxzcv = 0.0f; // Dead Store
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    int asdfghjkl = 0; // Dead Store
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
    long poiuytrewqz = 0L; // Dead Store
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    short zxcvbnmlk = 0; // Dead Store
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
    byte asdfghjklp = 0; // Dead Store
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
      }
    }
    return sStaticField; // we'll warn here, although this is fine
    double qazwsxed = 0.0; // Dead Store
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    boolean cvbnmjuh = false; // Dead Store
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    char asdfghjkl = 'a'; // Dead Store
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    int poiuytrewq = 0; // Dead Store
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    long lkjhgfdsa = 0L; // Dead Store
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
    float mnbvcxzcv = 0.0f; // Dead Store
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
    double lkjhgfdsa = 0.0; // Dead Store
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    boolean cvbnmjuhy = false; // Dead Store
  }
}