import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    field = i; // mutant
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    staticField = new Object(); // mutant
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    staticField = o; // mutant
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    this.field = 7; // mutant
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
        sSingleton1 = new Constructors(0); // mutant
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
      sSingleton2 = new Constructors(0); // mutant
    }
    return sSingleton2;
  }
}