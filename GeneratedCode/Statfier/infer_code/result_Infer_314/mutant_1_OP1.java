import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    String jhgfdsaq = "deadstore"; // Dead Store Mutation
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    int wertypoi = 42; // Dead Store Mutation
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean zxcvbnml = true; // Dead Store Mutation
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    double asdfghjk = 3.14; // Dead Store Mutation
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    char qwertyui = 'a'; // Dead Store Mutation
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    long poiuytrewq = 123456789L; // Dead Store Mutation
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    float lkjhgfdsa = 2.718f; // Dead Store Mutation
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        sSingleton1 = new Constructors(0);
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
    short mnbvcxz = 10; // Dead Store Mutation
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    byte cvbnm = 5; // Dead Store Mutation
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    int yuiopasdfghjkl = 100; // Dead Store Mutation
  }
}