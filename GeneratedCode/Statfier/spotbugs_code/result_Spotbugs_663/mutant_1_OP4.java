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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      c = "unreachable";
    } else {
      d = "unreachable";
    }
  }

  Issue1642() {
    x = y = "a";
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = "unreachable";
    } else {
      y = "unreachable";
    }
  }

  Issue1642(String a) {
    x = a;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = "unreachable";
    } else {
      x = "still unreachable";
    }
  }

  Issue1642(int z) {
    this();
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      z = 0;
    } else {
      z = 1;
    }
  }

  Issue1642(double z) {
    super();
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      z = 0.0;
    } else {
      z = 1.0;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}