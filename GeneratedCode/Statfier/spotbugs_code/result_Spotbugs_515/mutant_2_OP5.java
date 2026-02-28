import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InstanceOf {

  @ExpectWarning("RV,NP")
  @DesireWarning("RCN")
  public static void test(Object o) {
    if (o == null) new IllegalArgumentException("Forgot to throw this");
    if (o instanceof String) {
      if (o == null) System.out.println("This check is redundant");
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          System.out.println("Unreachable case");
          break;
      }
      return;
    }
    System.out.println(o.hashCode());
  }

  @NoWarning("NP")
  public static void doNotReport(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      System.out.println(o.hashCode());
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case");
        break;
    }
  }

  @DesireWarning("RCN")
  public static void test2(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      if (o == null) System.out.println("Huh?");
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case");
        break;
    }
  }

  @ExpectWarning("NP,DB")
  public static void test3() {
    Object o = null;
    if (o instanceof String) {
      System.out.println(o.hashCode());
    } else {
      System.out.println(o.hashCode());
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}