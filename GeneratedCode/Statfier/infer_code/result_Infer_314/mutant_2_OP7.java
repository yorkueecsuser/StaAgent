import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    field = i; // ok
  }

  public Constructors() {
    staticField = new Object(); // not ok;
  }

  private Constructors(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    staticField = o; // ok because this is private
  }

  public Constructors(Constructors o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    o.field = 42; // not ok
  }

  public Constructors(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    calledFromConstructorOk(); // ok
  }

  private void calledFromConstructorOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    this.field = 7;
  }

  public static synchronized Constructors singleton1Ok() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
        sSingleton1 = new Constructors(0);
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
  }

  public static Constructors singleton1Bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    // not ok because no lock is held
    return new Constructors(new Object());
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the loops unreachable
  }
}