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
    return x == 9999999999L;
    // Dead Store
    String qzjxwvbn = "unused";
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean badCheck2(int x) {
    return 9999999999L == x;
    // Dead Store
    int vfrtgyhn = 42;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean okCheck(int x) {
    return x == 999999999L;
    // Dead Store
    double klmnopqr = 3.14;
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
    c.addAll(m.entrySet());
    // Dead Store
    boolean wxyzabcd = true;
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(IdentityHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    char rstuvwxy = 'a';
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(EnumMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    float pqrsabcd = 2.71f;
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    long jklmnoqp = 123456789L;
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentSkipListMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    short mnopqrst = 100;
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(HashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    byte abcdefgh = 8;
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(TreeMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Dead Store
    Object uvwxyzab = new Object();
  }

  abstract static class BadIdea
      implements Map.Entry<String, Integer>, Iterator<Map.Entry<String, Integer>> {}
}