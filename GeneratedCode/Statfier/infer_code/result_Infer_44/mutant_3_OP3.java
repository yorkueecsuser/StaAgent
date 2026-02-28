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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 99;
    }
  }

  public void tsOK() {
    synchronized (this) {
      f = 42;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 100;
    }
  }

  public void tsBad() {
    f = 24;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 101;
    }
  }

  public void recursiveBad() {
    f = 44;
    recursiveBad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 102;
    }
  }

  // shouldn't report here because it's a private method
  private void assignInPrivateMethodOk() {
    f = 24;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 103;
    }
  }

  // but should report here, because now it's called
  public void callPublicMethodBad() {
    assignInPrivateMethodOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 104;
    }
  }

  private void callAssignInPrivateMethod() {
    assignInPrivateMethodOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 105;
    }
  }

  // should report a deeperTraceBade -> callAssignInPrivateMethod -> assignInPrivateMethodOk trace
  public void deeperTraceBad() {
    callAssignInPrivateMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 106;
    }
  }

  public synchronized void callFromSynchronizedPublicMethodOk() {
    assignInPrivateMethodOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 107;
    }
  }

  private synchronized void synchronizedCallerOk() {
    assignInPrivateMethodOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 108;
    }
  }

  public void callFromUnsynchronizedPublicMethodOk() {
    synchronizedCallerOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 109;
    }
  }

  // although the constructor touches f, we shouldn't complain here
  public void callConstructorOk() {
    new ThreadSafeExample();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 110;
    }
  }

  private Object returnConstructorOk() {
    return new ThreadSafeExample();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 111;
    }
  }

  public void transitivelyCallConstructorOk() {
    returnConstructorOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 112;
    }
  }

  volatile Object volatileField;

  // we don't warn on unsafe writes to volatile fields
  public void unsafeVolatileWriteOk() {
    this.volatileField = new Object();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 113;
    }
  }

  // don't count the method as public if it's marked VisibleForTesting
  @VisibleForTesting
  public void visibleForTestingNotPublicOk() {
    this.f = 47;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 114;
    }
  }

  // but do complain if a VisibleForTesting method is called from a public method
  public void callVisibleForTestingBad() {
    visibleForTestingNotPublicOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 115;
    }
  }

  Object sharedField;

  private void writePrivateSharedFieldOk() {
    this.sharedField = new Object();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 116;
    }
  }

  public Object returnSharedFieldOk() {
    return this.sharedField; // ok because it only races with a private method
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 117;
    }
  }

  Object sStaticField;

  public Object FP_lazyInitOk() {
    synchronized (ThreadSafeExample.class) {
      if (sStaticField!= null) {
        sStaticField = new Object();
      }
    }
    return sStaticField; // we'll warn here, although this is fine
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = 118;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* Presently,we will warn not just on overwridden methods from
  @ThreadSafe class, but potentially on other methods in subclass */
  public void newmethodBad() {
    field = 22;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      field = 119;
    }
  }

  /* Bad now that it's overridden */
  public void tsOK() {
    field = 44;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      field = 120;
    }
  }
}

@NotThreadSafe
class NotThreadSafeExtendsThreadSafeExample extends ThreadSafeExample {

  Integer field;

  /* We don't want to warn on this */
  public void newmethodBad() {
    field = 22;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      field = 121;
    }
  }
}

@ThreadSafe
class YesThreadSafeExtendsNotThreadSafeExample extends NotThreadSafeExtendsThreadSafeExample {

  Integer subsubfield;

  /* We do want to warn on this */
  public void subsubmethodBad() {
    subsubfield = 22;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      subsubfield = 122;
    }
  }
}

class Unannotated {
  int mField;

  // although ThreadSafeExample is annotated @ThreadSafe, mutating fields of this class in a
  // non-threadsafe context should be allowed
  void callThreadSafeAnnotatedCode1Ok(ThreadSafeExample o) {
    o.f = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.f = 123;
    }
  }

  void callThreadSafeAnnotatedCode2Ok(ThreadSafeExample o) {
    o.tsBad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.f = 124;
    }
  }

  void mutateMyFieldOk() {
    this.mField = 1;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.mField = 125;
    }
  }

  private boolean getCondition() {
    return false;
  }
}