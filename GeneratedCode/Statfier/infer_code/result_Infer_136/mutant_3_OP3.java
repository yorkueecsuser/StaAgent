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
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        dummy = 3; // This branch is unreachable because getCondition() always returns false
      }
    }
    for (Integer y : Y) {
      dummy = 2;
    }
  }

  // Method to return a false condition dynamically
  private static boolean getCondition() {
    return false;
  }
}