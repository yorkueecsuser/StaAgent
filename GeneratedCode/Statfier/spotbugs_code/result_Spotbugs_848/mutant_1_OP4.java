import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class SetTests {

  public void test1NoBugs(Set<String> set) {
    set.contains("Hello");
    set.remove("Hello");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test1NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test1NoBugs");
    }
  }

  public void test1Bugs(Set<String> set) {
    set.contains(new StringBuffer("Key"));
    set.remove(new StringBuffer("Key"));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test1Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test1Bugs");
    }
  }

  public void test2NoBugs(SortedSet<CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test2NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test2NoBugs");
    }
  }

  public void test2Bugs(SortedSet<CharSequence> set) {
    set.contains(Integer.valueOf(3));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test2Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test2Bugs");
    }
  }

  public void test3NoBugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(new StringBuffer("Key"));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test3NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test3NoBugs");
    }
  }

  public void test3Bugs(LinkedHashSet<? extends CharSequence> set) {
    set.remove(Integer.valueOf(3));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test3Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test3Bugs");
    }
  }

  public void test4NoBugs(TreeSet<? super CharSequence> set) {
    set.contains(new StringBuffer("Key"));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test4NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test4NoBugs");
    }
  }

  public void test4Bugs(TreeSet<? super CharSequence> set) {
    set.contains(Integer.valueOf(3));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test4Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test4Bugs");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}