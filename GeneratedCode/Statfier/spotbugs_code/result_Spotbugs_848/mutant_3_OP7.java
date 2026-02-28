import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains("Hello");
    set.remove("Hello");
  }

  public void test1Bugs(Set<String> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains(new StringBuffer("Key"));
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains(Integer.valueOf(3));
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.remove(new StringBuffer("Key"));
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.remove(Integer.valueOf(3));
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains(new StringBuffer("Key"));
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    set.contains(Integer.valueOf(3));
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}