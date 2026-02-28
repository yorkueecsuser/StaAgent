import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Ideas_2010_12_11 {

  static class MultivaluedMap<K, V> extends HashMap<K, List<V>> {}

  static class StringStringMap extends HashMap<String, String> {}

  static MultivaluedMap<String, String> m = new MultivaluedMap<String, String>();

  public static void f1() {
    MultivaluedMap<String, String> m2 = m;
    for (String s : m.get("x")) System.out.println(s);

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable");
    }
  }

  public static void f2() {
    StringStringMap m2 = new StringStringMap();
    String s = m2.get("x");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable");
    }
  }

  public static void f3() {
    Map m2 = new StringStringMap();
    Integer s = (Integer) m2.get("x");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable");
    }
  }

  public static void main(String args[]) {

    List<String> lst = new ArrayList<String>();
    lst.add("a");
    lst.add("b");
    m.put("x", lst);
    MultivaluedMap<String, String> m2 = m;
    for (String s : m.get("x")) System.out.println(s);
    for (String s : m2.get("x")) System.out.println(s);

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      System.out.println("This loop is unreachable");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}