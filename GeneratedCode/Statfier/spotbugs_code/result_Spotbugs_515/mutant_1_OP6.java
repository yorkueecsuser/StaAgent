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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  @DesireWarning("RCN")
  public static void test2(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      if (o == null) System.out.println("Huh?");
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the loop unreachable
  }
}