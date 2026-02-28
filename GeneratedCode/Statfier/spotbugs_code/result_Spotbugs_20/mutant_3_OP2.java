import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class Ideas_2009_04_30 {

  public static void main(String args[]) {
    HashMap m = new HashMap();
    m = new HashMap(); // Mutant: duplicated assignment
    System.out.println(m.equals(null));

    LinkedHashMap lhm = (LinkedHashMap) m;
    lhm = (LinkedHashMap) m; // Mutant: duplicated assignment

    ArrayList<String> a = new ArrayList<String>();
    a = new ArrayList<String>(); // Mutant: duplicated assignment

    String s[] = (String[]) a.toArray();
    Object x = m;
    x = m; // Mutant: duplicated assignment
    HashSet set = (HashSet) x;
    set = (HashSet) x; // Mutant: duplicated assignment
  }
}