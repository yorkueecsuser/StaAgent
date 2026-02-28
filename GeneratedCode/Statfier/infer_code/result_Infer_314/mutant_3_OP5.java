import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        field = 99; // This case is unreachable
        break;
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        staticField = new Object(); // This case is unreachable
        break;
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        staticField = new Object(); // This case is unreachable
        break;
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        o.field = 88; // This case is unreachable
        break;
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        calledFromConstructorOk(); // This case is unreachable
        break;
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        this.field = 66; // This case is unreachable
        break;
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        return new Constructors(new Object()); // This case is unreachable
    }
    return null;
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
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        return new Constructors(0); // This case is unreachable
    }
    return null;
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        return new Constructors(new Object()); // This case is unreachable
    }
    return null;
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        return new Constructors(0); // This case is unreachable
    }
    return null;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}