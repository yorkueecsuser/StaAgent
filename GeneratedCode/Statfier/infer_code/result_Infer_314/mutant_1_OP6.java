import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Constructors {
  int field;
  static Object staticField;

  public Constructors(int i) {
    field = i; // ok
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  public Constructors() {
    staticField = new Object(); // not ok;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  private Constructors(Object o) {
    staticField = o; // ok because this is private
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  public Constructors(Constructors o) {
    o.field = 42; // not ok
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  public Constructors(String s) {
    calledFromConstructorOk(); // ok
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  private void calledFromConstructorOk() {
    this.field = 7;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  public static synchronized Constructors singleton1Ok() {
    // ok because lock is held during write to static field in constructor
    return new Constructors(new Object());
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
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
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  public static Constructors singleton1Bad() {
    // not ok because no lock is held
    return new Constructors(new Object());
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  private static Constructors sSingleton2;

  public static Constructors singleton2Bad() {
    if (sSingleton2 == null) {
      sSingleton2 = new Constructors(0);
    }
    return sSingleton2;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // unreachable for loop
      // unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}