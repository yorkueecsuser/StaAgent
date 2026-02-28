import java.util.HashMap;
import java.util.Map;

class NP {

  int x;

  static Map m = new HashMap();

  public static void main(String args[]) {
    NP n = (NP) m.get("Foo");

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }

    if (n == null) System.out.println(n.x);
    else System.out.println(n.x);
    if (n!= null) System.out.println(n.x);
    else System.out.println(n.x);

    System.out.println(null!= n? n.hashCode() : 0);
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}