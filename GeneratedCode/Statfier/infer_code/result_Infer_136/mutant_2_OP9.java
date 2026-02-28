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
    Character[] charArray = "X".toCharArray();
    int i = 0;
    do {
      if (i < charArray.length) {
        Character x = charArray[i];
        dummy = 1;
        i++;
      }
    } while (i < charArray.length);

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