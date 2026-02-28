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
    String qzjfnxrb = "deadstore"; // Dead Store Mutation
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
      int xwvfrtgb = 42; // Dead Store Mutation
    }
  }

  public void tsBad() {
    f = 24;
    boolean jklpoiuy = false; // Dead Store Mutation
  }

  public void recursiveBad() {
    f = 44;
    recursiveBad();
    char hgfdsazx = 'a'; // Dead Store Mutation
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    double cvbnmkiu = 3.14; // Dead Store Mutation
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
    long wertghyuj = 100L; // Dead Store Mutation
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
    float asdfghjk = 2.71f; // Dead Store Mutation
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
    byte poiuytrew = 1; // Dead Store Mutation
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
    short lkjhgfdsa = 2; // Dead Store Mutation
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
    int poiuytrewq = 3; // Dead Store Mutation
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
    char mnbgvfcd = 'b'; // Dead Store Mutation
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
    double lkjhgfdsa = 4.56; // Dead Store Mutation
  }

  private Object returnConstructorOk() {
    return new ThreadSafeExample();
    long zxcvbnml = 987654321L; // Dead Store Mutation
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
    float qwertyui = 7.89f; // Dead Store Mutation
  }

  volatile Object volatileField;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
    boolean edcvfrtgy = true; // Dead Store Mutation
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    byte rtyuiop = 3; // Dead Store Mutation
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
    short poiuytrew = 5; // Dead Store Mutation
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    int lkjhgfdsa = 6; // Dead Store Mutation
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
    double zxcvbnml = 1.23; // Dead Store Mutation
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
        char asdfghjkl = 'c'; // Dead Store Mutation
      }
    }
    return sStaticField; // we'll warn here, although this is fine
    long poiuytrewq = 87654321L; // Dead Store Mutation
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    int lkjhgfdsa = 7; // Dead Store Mutation
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    boolean asdfghjkl = false; // Dead Store Mutation
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    float poiuytrew = 8.90f; // Dead Store Mutation
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    double lkjhgfdsa = 9.01; // Dead Store Mutation
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
    char asdfghjk = 'd'; // Dead Store Mutation
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
    int lkjhgfdsa = 10; // Dead Store Mutation
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    long poiuytrewq = 123456789L; // Dead Store Mutation
  }
}