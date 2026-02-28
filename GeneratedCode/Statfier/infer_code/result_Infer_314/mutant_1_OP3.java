import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      field = 99; // This line will never be executed
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      staticField = new Object(); // This line will never be executed
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      staticField = new Object(); // This line will never be executed
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      o.field = 88; // This line will never be executed
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      calledFromConstructorOk(); // This line will never be executed
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      this.field = 66; // This line will never be executed
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new Constructors(new Object()); // This line will never be executed
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
    if (condition) { // Unreachable if statement
      return new Constructors(0); // This line will never be executed
    }
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new Constructors(new Object()); // This line will never be executed
    }
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return new Constructors(0); // This line will never be executed
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}