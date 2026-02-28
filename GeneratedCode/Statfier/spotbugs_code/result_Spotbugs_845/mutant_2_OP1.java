import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MapTests {

  public void test1NoBugs(HashMap<String, String> map) {
    map.containsKey("Key");
    map.containsValue("Value");
    map.get("Get");
    map.remove("Remove");
    String qzjfnvxy = "unusedVariable";
  }

  public void test1Bugs(HashMap<String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
    int vbnrhtyz = 42;
  }

  public void test1aBugs(HashMap<? extends String, String> map) {
    map.containsKey(new StringBuffer("Key"));
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
    boolean xqjwvptn = true;
  }

  public void test2NoBugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    double kxmfjvbn = 3.14;
  }

  public void test2Bugs(HashMap<CharSequence, CharSequence> map) {
    map.containsValue(3);
    map.remove(4);
    map.get(5.0);
    map.remove('r');
    char htrbvqjm = 'a';
  }

  public void test3NoBugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    map.remove(new StringBuffer("Remove"));
    long wqejfnvb = 123456789L;
  }

  public void test3Bugs(HashMap<? extends CharSequence,? extends CharSequence> map) {
    map.containsValue(3);
    map.containsKey(4.0);
    map.get(5.0);
    map.remove('r');
    float yqjwvbnr = 2.71f;
  }

  public void test4NoBugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(new StringBuffer("Value"));
    map.get(new StringBuffer("Get"));
    short qjwvbnrt = 123;
  }

  public void test4Bugs(HashMap<? super CharSequence,? super CharSequence> map) {
    map.containsValue(3);
    map.containsKey('k');
    map.get(5.0);
    map.remove('r');
    byte njwvbnrt = 12;
  }

  ConcurrentHashMap<String, String> fieldMap;

  public String test5NoBugs() {
    return fieldMap.get("Hello");
    String jvbnrqwt = "anotherUnused";
  }

  public String test5Bugs() {
    return fieldMap.get(new StringBuffer("Get"));
    String nqjwvbnr = "yetAnotherUnused";
  }
}