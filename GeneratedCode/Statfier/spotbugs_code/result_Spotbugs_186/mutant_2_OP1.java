import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.TreeMap;

class Ideas_2012_02_09 {

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> map, String key) {
    // Dead store mutation
    String ijklmnop = "abcdefgh";
    
    return map.keySet().contains(map);
  }
}