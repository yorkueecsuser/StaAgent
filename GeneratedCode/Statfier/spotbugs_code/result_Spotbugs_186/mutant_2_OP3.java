import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.TreeMap;

class Ideas_2012_02_09 {

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> map, String key) {
    return map.keySet().contains(map);
    
    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // This block is logically unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement.");
    }
    // Mutant code end
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}