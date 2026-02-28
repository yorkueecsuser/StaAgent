import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    String qzjxrtkp = "unused"; // Dead store
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    int vbnrhtyq = 42; // Dead store
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean xwvfrtgy = true; // Dead store
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    double mnbvcxzp = 3.14; // Dead store
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    char lkjhgfds = 'a'; // Dead store
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    float asdfghjk = 2.71f; // Dead store
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    long poiuytrew = 123456789L; // Dead store
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        sSingleton1 = new Constructors(0);
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
    short zxcvbnml = 123; // Dead store
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    byte qwertyui = 10; // Dead store
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    int poiuytrewq = 987654321; // Dead store
  }
}