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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      c = "unreachable";
    } else {
      d = "unreachable";
    }
  }

  Issue1642() {
    x = y = "a";
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = "unreachable";
    } else {
      y = "unreachable";
    }
  }

  Issue1642(String a) {
    x = a;
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = "unreachable";
    } else {
      x = "still unreachable";
    }
  }

  Issue1642(int z) {
    this();
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = "unreachable";
    } else {
      y = "unreachable";
    }
  }

  Issue1642(double z) {
    super();
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      a = "unreachable";
    } else {
      b = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}