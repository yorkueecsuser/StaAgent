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
    String unusedVar1 = "abcdefgh"; // Dead Store
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean badCheck2(int x) {
    return 9999999999L == x;
    int unusedVar2 = 12345678; // Dead Store
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean okCheck(int x) {
    return x == 999999999L;
    double unusedVar3 = 123.456789; // Dead Store
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
    char unusedVar4 = 'a'; // Dead Store
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(IdentityHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    boolean unusedVar5 = true; // Dead Store
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(EnumMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    float unusedVar6 = 123.456f; // Dead Store
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    long unusedVar7 = 1234567890L; // Dead Store
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentSkipListMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    short unusedVar8 = 1234; // Dead Store
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(HashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    byte unusedVar9 = 12; // Dead Store
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(TreeMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    Object unusedVar10 = new Object(); // Dead Store
  }

  abstract static class BadIdea
      implements Map.Entry<String, Integer>, Iterator<Map.Entry<String, Integer>> {}
}