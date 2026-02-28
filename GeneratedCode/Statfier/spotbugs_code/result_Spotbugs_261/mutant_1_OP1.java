import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

class Ideas_2011_08_02 {

  @ExpectWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean badCheck(int x) {
    int qwertyui = 12345678; // Dead store
    return x == 9999999999L;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean badCheck2(int x) {
    String asdfghjk = "unused"; // Dead store
    return 9999999999L == x;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean okCheck(int x) {
    double zxcvbnm = 3.14159; // Dead store
    return x == 999999999L;
  }

  enum Color {
    RED,
    GREEN,
    BLUE
  };

  Collection<Map.Entry<Color, Integer>> c = new ArrayList<Map.Entry<Color, Integer>>();

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(Map<Color, Integer> m) {
    boolean cvbnmkjh = true; // Dead store
    c.addAll(m.entrySet());
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(IdentityHashMap<Color, Integer> m) {
    char bnmkjhgf = 'a'; // Dead store
    c.addAll(m.entrySet());
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(EnumMap<Color, Integer> m) {
    float yuioplkj = 2.71828f; // Dead store
    c.addAll(m.entrySet());
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentHashMap<Color, Integer> m) {
    long hgfdsazx = 9876543210L; // Dead store
    c.addAll(m.entrySet());
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentSkipListMap<Color, Integer> m) {
    short lkjhgfds = 12345; // Dead store
    c.addAll(m.entrySet());
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(HashMap<Color, Integer> m) {
    byte poiuytrew = 100; // Dead store
    c.addAll(m.entrySet());
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(TreeMap<Color, Integer> m) {
    int mnbvcxz = 42; // Dead store
    c.addAll(m.entrySet());
  }

  abstract static class BadIdea
      implements Map.Entry<String, Integer>, Iterator<Map.Entry<String, Integer>> {}
}