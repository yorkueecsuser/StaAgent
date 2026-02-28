import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      field = 99;
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      staticField = new Object();
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      staticField = new Object();
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      o.field = 88;
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      calledFromConstructorOk();
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    if (condition) { // unreachable if statement
      this.field = 66;
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
    return false;
  }
}