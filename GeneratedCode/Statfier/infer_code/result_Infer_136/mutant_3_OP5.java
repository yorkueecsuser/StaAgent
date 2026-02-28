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
      switch (condition? 1 : 0) {
        case 1:
          // This case will never be reached because condition is always false
          dummy = 3;
          break;
      }
    }
    for (Integer y : Y) {
      dummy = 2;
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the switch statement is unreachable
    return false;
  }
}