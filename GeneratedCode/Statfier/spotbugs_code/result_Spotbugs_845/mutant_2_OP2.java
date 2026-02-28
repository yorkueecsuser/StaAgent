import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MapTests {

  public void test1NoBugs(HashMap<String, String> map) {
    map.containsKey("Key");
    map.containsKey("Key"); // Mutation: Duplicate of the previous line
    map.containsValue("Value");
    map.containsValue("Value"); // Mutation: Duplicate of the previous line
    map.get("Get");
    map.get("Get"); // Mutation: Duplicate of the previous line
    map.remove("Remove");
    map.remove("Remove"); // Mutation: Duplicate of the previous line
  }

  public void test1Bugs(HashMap<String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsKey(new StringBuffer("Key")); // Mutation: Duplicate of the previous line
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutation: Duplicate of the previous line
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutation: Duplicate of the previous line
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutation: Duplicate of the previous line
  }

  public void test1aBugs(HashMap<? extends String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsKey(new StringBuffer("Key")); // Mutation: Duplicate of the previous line
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutation: Duplicate of the previous line
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutation: Duplicate of the previous line
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutation: Duplicate of the previous line
  }

  public void test2NoBugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutation: Duplicate of the previous line
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutation: Duplicate of the previous line
  }

  public void test2Bugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutation: Duplicate of the previous line
    map.remove(4);
    map.remove(4); // Mutation: Duplicate of the previous line
    map.get(5.0);
    map.get(5.0); // Mutation: Duplicate of the previous line
    map.remove('r');
    map.remove('r'); // Mutation: Duplicate of the previous line
  }

  public void test3NoBugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutation: Duplicate of the previous line
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutation: Duplicate of the previous line
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutation: Duplicate of the previous line
  }

  public void test3Bugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutation: Duplicate of the previous line
    map.containsKey(4.0);
    map.containsKey(4.0); // Mutation: Duplicate of the previous line
    map.get(5.0);
    map.get(5.0); // Mutation: Duplicate of the previous line
    map.remove('r');
    map.remove('r'); // Mutation: Duplicate of the previous line
  }

  public void test4NoBugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutation: Duplicate of the previous line
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutation: Duplicate of the previous line
  }

  public void test4Bugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutation: Duplicate of the previous line
    map.containsKey('k');
    map.containsKey('k'); // Mutation: Duplicate of the previous line
    map.get(5.0);
    map.get(5.0); // Mutation: Duplicate of the previous line
    map.remove('r');
    map.remove('r'); // Mutation: Duplicate of the previous line
  }

  ConcurrentHashMap<String, String> fieldMap;

  public String test5NoBugs() {
    return fieldMap.get("Hello");
    // No applicable assignment statement without method invocation to duplicate
  }

  public String test5Bugs() {
    return fieldMap.get(new StringBuffer("Get"));
    // No applicable assignment statement without method invocation to duplicate
  }
}