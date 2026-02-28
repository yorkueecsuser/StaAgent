import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    set.contains("Hello");
    set.remove("Hello");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test1Bugs(Set<String> set) {
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    set.contains(Integer.valueOf(3));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(new StringBuffer("Key"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(Integer.valueOf(3));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    set.contains(Integer.valueOf(3));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      set.add("Unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}