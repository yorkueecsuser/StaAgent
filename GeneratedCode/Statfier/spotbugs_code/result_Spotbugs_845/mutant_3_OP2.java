import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MapTests {

  public void test1NoBugs(HashMap<String, String> map) {
    map.containsKey("Key");
    map.containsKey("Key"); // Mutant
    map.containsValue("Value");
    map.containsValue("Value"); // Mutant
    map.get("Get");
    map.get("Get"); // Mutant
    map.remove("Remove");
    map.remove("Remove"); // Mutant
  }

  public void test1Bugs(HashMap<String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsKey(new StringBuffer("Key")); // Mutant
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutant
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutant
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutant
  }

  public void test1aBugs(HashMap<? extends String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsKey(new StringBuffer("Key")); // Mutant
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutant
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutant
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutant
  }

  public void test2NoBugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutant
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutant
  }

  public void test2Bugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutant
    map.remove(4);
    map.remove(4); // Mutant
    map.get(5.0);
    map.get(5.0); // Mutant
    map.remove('r');
    map.remove('r'); // Mutant
  }

  public void test3NoBugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutant
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutant
    map.remove(new StringBuffer("Remove"));
    map.remove(new StringBuffer("Remove")); // Mutant
  }

  public void test3Bugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutant
    map.containsKey(4.0);
    map.containsKey(4.0); // Mutant
    map.get(5.0);
    map.get(5.0); // Mutant
    map.remove('r');
    map.remove('r'); // Mutant
  }

  public void test4NoBugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.containsValue(new StringBuffer("Value")); // Mutant
    map.get(new StringBuffer("Get"));
    map.get(new StringBuffer("Get")); // Mutant
  }

  public void test4Bugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(3);
    map.containsValue(3); // Mutant
    map.containsKey('k');
    map.containsKey('k'); // Mutant
    map.get(5.0);
    map.get(5.0); // Mutant
    map.remove('r');
    map.remove('r'); // Mutant
  }

  ConcurrentHashMap<String, String> fieldMap;

  public String test5NoBugs() {
    return fieldMap.get("Hello");
    return fieldMap.get("Hello"); // Mutant
  }

  public String test5Bugs() {
    return fieldMap.get(new StringBuffer("Get"));
    return fieldMap.get(new StringBuffer("Get")); // Mutant
  }
}