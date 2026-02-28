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
    }
    for (Integer y : Y) {
      dummy = 2;
    }

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        dummy = 3;
        break;
      case 1:
        // This case will always be reached
        dummy = 4;
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}