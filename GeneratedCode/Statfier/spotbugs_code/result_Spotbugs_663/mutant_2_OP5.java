import javax.annotation.Nonnull;

class Issue1642 {

  @Nonnull static Object a;
  @Nonnull static Object b;
  @Nonnull static Object c;
  @Nonnull static Object d;
  @Nonnull Object x;
  @Nonnull Object y;

  static {
    c = c;
    d = a;
    a = "a";
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        a = "unreachable";
        break;
      case 1:
        // This case will always be executed
        b = "reachable";
        break;
    }
  }

  Issue1642() {
    x = y = "a";
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = "unreachable";
        break;
      case 1:
        // This case will always be executed
        y = "reachable";
        break;
    }
  }

  Issue1642(String a) {
    x = a;
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = "unreachable";
        break;
      case 1:
        // This case will always be executed
        x = "reachable";
        break;
    }
  }

  Issue1642(int z) {
    this();
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        z = 0;
        break;
      case 1:
        // This case will always be executed
        z = 1;
        break;
    }
  }

  Issue1642(double z) {
    super();
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        z = 0.0;
        break;
      case 1:
        // This case will always be executed
        z = 1.0;
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}