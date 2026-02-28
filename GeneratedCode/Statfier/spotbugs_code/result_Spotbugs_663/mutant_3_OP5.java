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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        c = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  Issue1642() {
    x = y = "a";
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        x = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  Issue1642(String a) {
    x = a;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        x = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  Issue1642(int z) {
    this();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        x = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  Issue1642(double z) {
    super();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        x = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}