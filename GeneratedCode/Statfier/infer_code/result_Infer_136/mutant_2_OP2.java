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
      dummy = 1; // Original assignment
      dummy = 1; // Mutated duplicate
    }
    for (Integer y : Y) {
      dummy = 2; // Original assignment
      dummy = 2; // Mutated duplicate
    }
  }
}