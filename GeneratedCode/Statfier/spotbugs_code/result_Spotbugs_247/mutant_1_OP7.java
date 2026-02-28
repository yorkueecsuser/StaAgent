import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2010_06_16 {

  @NoWarning("NP")
  static void test2(@Nullable Object... t) {
    for (Object x : t) {
      System.err.println(x);
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  public static void main(String args[]) {
    test2("a", "b");
    main2();
    // Inserting unreachable while loop
    boolean conditionWhileMain = getCondition();
    while (conditionWhileMain) {
      // Unreachable code
      System.out.println("This is an unreachable loop in main");
    }
  }

  public static void main2() {
    test2((Object[]) null);
    // Inserting unreachable while loop
    boolean conditionWhileMain2 = getCondition();
    while (conditionWhileMain2) {
      // Unreachable code
      System.out.println("This is an unreachable loop in main2");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}