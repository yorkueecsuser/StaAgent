import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      field = 99;
    } else {
      // Another code that should also never run
      field = 88;
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      staticField = new Object();
    } else {
      // Another code that should also never run
      staticField = new Object();
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      staticField = new Object();
    } else {
      // Another code that should also never run
      staticField = new Object();
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      o.field = 99;
    } else {
      // Another code that should also never run
      o.field = 88;
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      field = 99;
    } else {
      // Another code that should also never run
      field = 88;
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      this.field = 99;
    } else {
      // Another code that should also never run
      this.field = 88;
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        sSingleton1 = new Constructors(0);
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}