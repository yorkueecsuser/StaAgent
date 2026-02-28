import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test1NoBugs");
    }
    list.contains("Hello");
    list.remove("Hello");
    list.indexOf("Hello");
    list.lastIndexOf("Hello");
  }

  public void test1Bugs(List<String> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test1Bugs");
    }
    list.contains(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test2NoBugs");
    }
    list.indexOf(new StringBuffer("Key"));
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test2Bugs");
    }
    list.indexOf(Integer.valueOf(3));
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test3NoBugs");
    }
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test3Bugs");
    }
    list.lastIndexOf(Integer.valueOf(3));
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test4NoBugs");
    }
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test4Bugs");
    }
    list.lastIndexOf(Integer.valueOf(3));
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}