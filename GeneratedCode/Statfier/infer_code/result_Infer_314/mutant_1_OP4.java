import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      field = 99;
    } else {
      // Another unreachable code
      field = 88;
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      staticField = new Object();
    } else {
      // Another unreachable code
      staticField = new Object();
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      staticField = new Object();
    } else {
      // Another unreachable code
      staticField = new Object();
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      o.field = 99;
    } else {
      // Another unreachable code
      o.field = 88;
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      calledFromConstructorOk();
    } else {
      // Another unreachable code
      calledFromConstructorOk();
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      this.field = 99;
    } else {
      // Another unreachable code
      this.field = 88;
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return new Constructors(new Object());
    } else {
      // Another unreachable code
      return new Constructors(new Object());
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
      // Some unreachable code
      return new Constructors(0);
    } else {
      // Another unreachable code
      return new Constructors(0);
    }
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return new Constructors(new Object());
    } else {
      // Another unreachable code
      return new Constructors(new Object());
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
      // Some unreachable code
      return new Constructors(0);
    } else {
      // Another unreachable code
      return new Constructors(0);
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}