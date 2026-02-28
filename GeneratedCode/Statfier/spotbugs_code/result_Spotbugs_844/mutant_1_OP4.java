import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    list.contains("Hello");
    list.remove("Hello");
    list.indexOf("Hello");
    list.lastIndexOf("Hello");
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test1NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test1NoBugs");
    }
  }

  public void test1Bugs(List<String> list) {
    list.contains(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key"));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test1Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test1Bugs");
    }
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    list.indexOf(new StringBuffer("Key"));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test2NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test2NoBugs");
    }
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    list.indexOf(Integer.valueOf(3));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test2Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test2Bugs");
    }
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test3NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test3NoBugs");
    }
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test3Bugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test3Bugs");
    }
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test4NoBugs");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test4NoBugs");
    }
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    
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