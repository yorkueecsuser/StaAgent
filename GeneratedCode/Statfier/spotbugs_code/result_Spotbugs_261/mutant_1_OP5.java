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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean badCheck2(int x) {
    return 9999999999L == x;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_INT_VALUE")
  public boolean okCheck(int x) {
    return x == 999999999L;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(IdentityHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.HIGH)
  public void addAll(EnumMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentHashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @ExpectWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.LOW)
  public void addAll(ConcurrentSkipListMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(HashMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @NoWarning(value = "DMI_ENTRY_SETS_MAY_REUSE_ENTRY_OBJECTS", confidence = Confidence.MEDIUM)
  public void addAll(TreeMap<Color, Integer> m) {
    c.addAll(m.entrySet());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  abstract static class BadIdea
      implements Map.Entry<String, Integer>, Iterator<Map.Entry<String, Integer>> {}

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}