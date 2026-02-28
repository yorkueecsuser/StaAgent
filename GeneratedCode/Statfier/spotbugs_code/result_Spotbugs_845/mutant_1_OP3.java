import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MapTests {

  public void test1NoBugs(HashMap<String, String> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test1NoBugs");
    }
    map.containsKey("Key");
    map.containsValue("Value");
    map.get("Get");
    map.remove("Remove");
  }

  public void test1Bugs(HashMap<String, String> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test1Bugs");
    }
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
  }

  public void test1aBugs(HashMap<? extends String, String> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test1aBugs");
    }
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
  }

  public void test2NoBugs(HashMap<CharSequence, CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test2NoBugs");
    }
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
  }

  public void test2Bugs(HashMap<CharSequence, CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test2Bugs");
    }
    map.containsValue(3);
    map.remove(4);
    map.get(5.0);
    map.remove('r');
  }

  public void test3NoBugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test3NoBugs");
    }
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
  }

  public void test3Bugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test3Bugs");
    }
    map.containsValue(3);
    map.containsKey(4.0);
    map.get(5.0);
    map.remove('r');
  }

  public void test4NoBugs(HashMap<? super CharSequence,? super CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test4NoBugs");
    }
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
  }

  public void test4Bugs(HashMap<? super CharSequence,? super CharSequence> map) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test4Bugs");
    }
    map.containsValue(3);
    map.containsKey('k');
    map.get(5.0);
    map.remove('r');
  }

  ConcurrentHashMap<String, String> fieldMap;

  public String test5NoBugs() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test5NoBugs");
    }
    return fieldMap.get("Hello");
  }

  public String test5Bugs() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in test5Bugs");
    }
    return fieldMap.get(new StringBuffer("Get"));
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on runtime conditions
  }
}