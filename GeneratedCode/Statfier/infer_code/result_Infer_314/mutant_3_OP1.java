import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    String xwvutsrq = "deadstore"; // Dead Store mutation
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    int pqonmlkj = 42; // Dead Store mutation
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean abcdefgh = true; // Dead Store mutation
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    double hijklmno = 3.14; // Dead Store mutation
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    char opqrstuv = 'a'; // Dead Store mutation
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    float vwxyzabc = 2.71f; // Dead Store mutation
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    long cdefghij = 100L; // Dead Store mutation
  }

  private static Constructors sSingleton1;

  public static Constructors FP_singleton2Ok() {
    synchronized (Constructors.class) {
      if (sSingleton1!= null) {
        sSingleton1 = new Constructors(0);
        short klmnopqr = 10; // Dead Store mutation
      }
    }
    return sSingleton1; // not currently smart enough to understand that this read is ok
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    byte stuvwxyz = 8; // Dead Store mutation
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
      int zyxwvuts = 5; // Dead Store mutation
    }
    return sSingleton2;
  }
}