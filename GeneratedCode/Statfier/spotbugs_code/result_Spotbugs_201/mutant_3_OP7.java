import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

class Bug3126724 {
  @DesireNoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void main(String args[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    for (int i = 1; i < args.length; i++) {
      if (i % 2 == 1) {
        System.out.print("");
      }
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    if (i > 0 && i % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    if (a.length % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This will never execute");
    }
    if (lst.size() % 2 == 1) System.out.println("odd");
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}