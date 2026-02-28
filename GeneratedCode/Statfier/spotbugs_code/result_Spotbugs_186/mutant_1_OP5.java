import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.TreeMap;

class Ideas_2012_02_09 {

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> map, String key) {
    return map.keySet().contains(map);

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable for the same reason
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}