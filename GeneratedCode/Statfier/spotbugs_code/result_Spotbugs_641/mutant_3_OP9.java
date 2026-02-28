import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Ideas_2010_12_09 {

  protected <T> T throwException(String msg) {
    throw new RuntimeException(msg);
  }

  public int hash(Object o) {
    if (o == null) throwException("Oops");
    return o.hashCode();
  }

  static class MultivaluedMap<K, V> extends HashMap<K, List<V>> {

    V foo() {
      return null;
    }
  }

  static MultivaluedMap<String, String> m = new MultivaluedMap<String, String>();

  public static void main(String args[]) {

    List<String> lst = new ArrayList<String>();
    lst.add("a");
    lst.add("b");
    m.put("x", lst);
    MultivaluedMap<String, String> m2 = m;
    
    // Original for loop replaced with equivalent do-while loop
    Iterator<String> iterator1 = m.get("x").iterator();
    do {
      String s = iterator1.next();
      System.out.println(s);
    } while (iterator1.hasNext());

    // Original for loop replaced with equivalent do-while loop
    Iterator<String> iterator2 = m2.get("x").iterator();
    do {
      String s = iterator2.next();
      System.out.println(s);
    } while (iterator2.hasNext());
  }
}