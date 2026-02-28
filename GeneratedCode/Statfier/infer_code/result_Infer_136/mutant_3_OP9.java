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
    Character[] chars = "X".toCharArray();
    int i = 0;
    do {
      if (i < chars.length) {
        Character x = chars[i];
        dummy = 1;
        i++;
      }
    } while (i < chars.length);

    int j = 0;
    do {
      if (j < Y.size()) {
        Integer y = Y.get(j);
        dummy = 2;
        j++;
      }
    } while (j < Y.size());
  }
}