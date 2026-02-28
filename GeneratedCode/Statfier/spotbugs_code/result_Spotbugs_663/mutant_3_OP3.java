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
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      b = "unreachable";
    }
  }

  Issue1642() {
    x = y = "a";
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      x = "unreachable";
    }
  }

  Issue1642(String a) {
    x = a;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      y = "unreachable";
    }
  }

  Issue1642(int z) {
    this();
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      x = "unreachable";
    }
  }

  Issue1642(double z) {
    super();
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      y = "unreachable";
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}