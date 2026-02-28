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
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    if (i > 0 && i % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    if (a.length % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    if (lst.size() % 2 == 1) System.out.println("odd");
    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      System.out.println("This loop is unreachable");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}