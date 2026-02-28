import java.util.HashMap;
import java.util.HashSet;
import junit.framework.TestCase;
import org.junit.Test;

class Ideas_2008_08_11 extends TestCase {

  @Test
  public void fooBar() throws Exception {
    assertFalse(Boolean.TRUE.equals(5));
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("a", 1);
    assertFalse(map.containsKey(1));
    assertNull(map.get(1));

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  @Test
  public void fooBar2() throws Exception {
    assertFalse(Boolean.TRUE.equals(5));
    HashSet<String> set = new HashSet<String>();
    set.add("a");
    assertFalse(set.contains(1));
    assertFalse(set.remove(1));

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  public void testFoo() throws Exception {
    assertFalse(Boolean.TRUE.equals(5));
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("a", 1);
    assertFalse(map.containsKey(1));
    assertNull(map.get(1));
    assertNull(map.remove(1));

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}