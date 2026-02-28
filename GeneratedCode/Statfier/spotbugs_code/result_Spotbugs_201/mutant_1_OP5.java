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
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    if (i > 0 && i % 2 == 1) System.out.println("odd");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    if (a.length % 2 == 1) System.out.println("odd");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    if (lst.size() % 2 == 1) System.out.println("odd");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}