import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CheckNested {

  public static void main(String args[]) {
    Set<Set<Integer>> s = new HashSet<Set<Integer>>();
    Map<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();

    Set<Long> l = new HashSet<Long>();

    s.remove(l);
    m.get(5).remove(l);

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}