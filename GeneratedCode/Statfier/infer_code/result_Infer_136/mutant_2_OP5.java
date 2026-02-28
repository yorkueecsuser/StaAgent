import java.util.ArrayList;
import java.util.List;

/**
 * Repro of HIL bindings issue: In the exception node, the invariant that a bound variable cannot
 * appear in the RHS of another binding is broken.
 */
class Hil {
  public static void foo() {
    List<Integer> Y = new ArrayList<>();
    int dummy = 0;
    for (Character x : "X".toCharArray()) {
      dummy = 1;
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          dummy = 3; // This case is unreachable because condition is always false
          break;
        default:
          dummy = 4; // This case is also unreachable because condition is always false
          break;
      }
    }
    for (Integer y : Y) {
      dummy = 2;
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}