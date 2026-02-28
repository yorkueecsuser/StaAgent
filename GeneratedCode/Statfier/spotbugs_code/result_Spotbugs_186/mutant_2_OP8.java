import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.TreeMap;

class Ideas_2012_02_09 {

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> map, String key) {
    return map.keySet().contains(map);
  }

  @DesireWarning("GC")
  public static boolean foo(TreeMap<String, String> b, String a) {
    return b.keySet().contains(b);
  }
}