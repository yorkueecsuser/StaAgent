import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    list.contains("Hello");
    list.remove("Hello");
    list.indexOf("Hello");
    list.lastIndexOf("Hello");
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test1Bugs(List<String> list) {
    list.contains(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key"));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    list.indexOf(new StringBuffer("Key"));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    list.indexOf(Integer.valueOf(3));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}