import codetoanalyze.java.annotation.ThreadSafe;
import com.google.common.annotations.VisibleForTesting;

class ThreadSafeMethods {

  Object field1;
  Object field2;
  Object field3;
  Object field4;
  Object field5;

  @ThreadSafe
  public void threadSafeMethodWriteBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field1 = new Object(); // should warn
  }

  @ThreadSafe
  public Object threadSafeMethodReadBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field2;
  }

  @ThreadSafe
  private void threadSafePrivateMethodBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field2 = new Object(); // should warn
  }

  @ThreadSafe
  @VisibleForTesting
  public void threadSafeVisibleForTestingMethodBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field3 = new Object(); // should warn
  }

  @ThreadSafe
  public void safeMethodOverride() {}

  // if a method annotated with @ThreadSafe in class C writes field f, then all other accesses to f
  // in C must also be thread-safe
  public void writeSameFieldAsThreadSafeMethod1Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    // warn here because field1 is also written in @ThreadSafe method threadSafeMethodWriteBad
    this.field1 = new Object();
  }

  // reads a field that is written in a method marked thread-safe
  public Object readSameFieldAsThreadSafeMethod1Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field1;
  }

  // TODO: should we report this or not?
  public synchronized void safelyWriteSameFieldAsThreadSafeMethod1Ok() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field1 = new Object();
  }

  public synchronized Object readSameFieldAsThreadSafeMethodWhileSynchronized1Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field1;
  }

  @ThreadSafe
  public synchronized void synchronizedWriteOk() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field4 = new Object();
  }

  // unprotected write to a field that is written safely in a method marked thread-safe
  public void writeSameFieldAsThreadSafeMethod2Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field4 = new Object();
  }

  // unprotected read of a field that is written safely in a method marked thread-safe
  public Object readSameFieldAsThreadSafeMethod2Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field4;
  }

  @ThreadSafe
  public synchronized Object FN_synchronizedReadBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field5;
  }

  private void privateAccessOk() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field5 = new Object();
  }

  // unprotected write to a field that is read safely in a method marked thread-safe
  public void FN_writeSameFieldAsThreadSafeMethod3Bad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field5 = new Object();
  }

  // none of the writes are marked thread-safe/locked, no reason to report
  public Object readSameFieldAsThreadSafeMethodOk() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field5;
  }

  private boolean getCondition() {
    return false;
  }
}

class ThreadSafeMethodsSubclass extends ThreadSafeMethods {
  Object subclassField;

  @Override
  // overrides method annotated with @ThreadSafe, should warn
  public void safeMethodOverride() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.subclassField = new Object();
  }

  public void FN_writeThreadSafeFieldOfSuperclassBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.field1 = new Object();
  }

  public Object FN_readThreadSafeFieldOfSuperclassBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.field1;
  }

  public void writeThreadSafeFieldOfOverrideBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    this.subclassField = new Object();
  }

  public Object readThreadSafeFieldOfOverrideBad() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return this.subclassField;
  }

  private boolean getCondition() {
    return false;
  }
}