import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.TreeMap;

class Ideas_2012_02_09 {

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> map, String key) {
    // Original buggy code
    return map.keySet().contains(map);

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}