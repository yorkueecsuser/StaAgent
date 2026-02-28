import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      field = 10;
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      field = 20;
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      field = 30;
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        sSingleton1 = new Constructors(0);
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      staticField = new Object();
    }
  }

  private static boolean getCondition() {
    return false;
  }
}