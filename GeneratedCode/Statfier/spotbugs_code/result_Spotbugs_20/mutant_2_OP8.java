import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class Ideas_2009_04_30 {

  public static void main(String args[]) {
    HashMap m = new HashMap();
    System.out.println(m.equals(null));

    LinkedHashMap lhm = (LinkedHashMap) m;

    ArrayList<String> a = new ArrayList<String>();

    String s[] = (String[]) a.toArray();
    Object x = m;
    HashSet set = (HashSet) x;

    // Mutated code
    HashMap n = new HashMap();
    System.out.println(n.equals(null));

    LinkedHashMap k = (LinkedHashMap) n;

    ArrayList<String> b = new ArrayList<String>();

    String t[] = (String[]) b.toArray();
    Object y = n;
    HashSet hset = (HashSet) y;
  }
}