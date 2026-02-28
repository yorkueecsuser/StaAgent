import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MapTests {

  public void test1NoBugs(HashMap<String, String> map) {
    map.containsKey("Key");
    map.containsValue("Value");
    map.get("Get");
    map.remove("Remove");

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test1Bugs(HashMap<String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test1aBugs(HashMap<? extends String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test2NoBugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test2Bugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(3);
    map.remove(4);
    map.get(5.0);
    map.remove('r');

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test3NoBugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test3Bugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(3);
    map.containsKey(4.0);
    map.get(5.0);
    map.remove('r');

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test4NoBugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public void test4Bugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(3);
    map.containsKey('k');
    map.get(5.0);
    map.remove('r');

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  ConcurrentHashMap<String, String> fieldMap;

  public String test5NoBugs() {
    return fieldMap.get("Hello");

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  public String test5Bugs() {
    return fieldMap.get(new StringBuffer("Get"));

    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the loop unreachable
  }
}