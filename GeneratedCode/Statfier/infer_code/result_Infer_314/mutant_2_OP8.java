import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
  }

  public Constructors() {
    staticField = new Object(); // not ok;
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
  }

  private void calledFromConstructorOk() {
    this.field = 7;
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

  // Mutated code starts here
  int a;
  static Object b;

  public Constructors(int j) {
    a = j; // ok
  }

  public Constructors() {
    b = new Object(); // not ok;
  }

  private Constructors(Object p) {
    b = p; // ok because this is private
  }

  public Constructors(Constructors q) {
    q.a = 42; // not ok
  }

  public Constructors(String t) {
    calledFromConstructorOk(); // ok
  }

  private void calledFromConstructorOk() {
    this.a = 7;
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
  }

  private static Constructors c;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (c!= null) {
        c = new Constructors(0);
      }
    }
    return c; // not currently smart enough to understand that this read is ok
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
  }

  private static Constructors d;

  public static Constructors singleton2Bad() {
    if (d == null) {
      d = new Constructors(0);
    }
    return d;
  }
}