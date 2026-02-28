import java.util.HashMap;
import java.util.Map;

class NP {

  int x;

  static Map m = new HashMap();

  public static void main(String args[]) {
    NP n = (NP) m.get("Foo");

    if (n == null) System.out.println(n.x);
    else System.out.println(n.x);
    if (n!= null) System.out.println(n.x);
    else System.out.println(n.x);

    System.out.println(null!= n? n.hashCode() : 0);

    // Mutated code
    int y = x; // Renamed 'x' to 'y'
    static Map a = new HashMap(); // Renamed'm' to 'a'
    NP z = (NP) a.get("Bar"); // Renamed 'n' to 'z' and'm' to 'a'
    
    if (z == null) System.out.println(z.y);
    else System.out.println(z.y);
    if (z!= null) System.out.println(z.y);
    else System.out.println(z.y);

    System.out.println(null!= z? z.hashCode() : 0);
  }
}