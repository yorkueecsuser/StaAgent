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
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  Issue1642() {
    x = y = "a";
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in constructor");
    }
  }

  Issue1642(String a) {
    x = a;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in String constructor");
    }
  }

  Issue1642(int z) {
    this();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in int constructor");
    }
  }

  Issue1642(double z) {
    super();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in double constructor");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}