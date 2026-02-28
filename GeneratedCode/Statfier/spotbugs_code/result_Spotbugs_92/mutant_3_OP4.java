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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  @Test
  public void fooBar2() throws Exception {
    assertFalse(Boolean.TRUE.equals(5));
    HashSet<String> set = new HashSet<String>();
    set.add("a");
    assertFalse(set.contains(1));
    assertFalse(set.remove(1));

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  public void testFoo() throws Exception {
    assertFalse(Boolean.TRUE.equals(5));
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("a", 1);
    assertFalse(map.containsKey(1));
    assertNull(map.get(1));
    assertNull(map.remove(1));

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  // Helper method to simulate dynamic condition
  private boolean getCondition() {
    return true; // This ensures the if block is reachable and else is unreachable
  }
}