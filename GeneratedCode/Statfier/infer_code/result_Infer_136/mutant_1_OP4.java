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
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        dummy = 3; // This block is intended to be unreachable
      } else {
        dummy = 4; // This block is also intended to be unreachable
      }
    }
    for (Integer y : Y) {
      dummy = 2;
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}