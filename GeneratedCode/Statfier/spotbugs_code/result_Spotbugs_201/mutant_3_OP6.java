import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

class Bug3126724 {
  @DesireNoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void main(String args[]) {
    for (int i = 1; i < args.length; i++) {
      if (i % 2 == 1) {
        System.out.print("");
      }
    }
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    if (i > 0 && i % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    if (a.length % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int m = 0; conditionFor; m++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    if (lst.size() % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int n = 0; conditionFor; n++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the loops unreachable
  }
}