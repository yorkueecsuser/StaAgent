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
    Iterator<String> iterator = m.get("x").iterator();
    do {
      if (!iterator.hasNext()) break;
      String s = iterator.next();
      System.out.println(s);
    } while (true);
  }

  public static void f2() {
    StringStringMap m2 = new StringStringMap();
    String s = m2.get("x");
  }

  public static void f3() {
    Map m2 = new StringStringMap();
    Integer s = (Integer) m2.get("x");
  }

  public static void main(String args[]) {

    List<String> lst = new ArrayList<String>();
    lst.add("a");
    lst.add("b");
    m.put("x", lst);
    MultivaluedMap<String, String> m2 = m;
    Iterator<String> iterator = m.get("x").iterator();
    do {
      if (!iterator.hasNext()) break;
      String s = iterator.next();
      System.out.println(s);
    } while (true);
    Iterator<String> iterator2 = m2.get("x").iterator();
    do {
      if (!iterator2.hasNext()) break;
      String s = iterator2.next();
      System.out.println(s);
    } while (true);
  }
}