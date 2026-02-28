import java.util.HashMap;
import java.util.Map;

class NP {

  int x;

  static Map m = new HashMap();

  public static void main(String args[]) {
    NP n = (NP) m.get("Foo");

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    if (n == null) System.out.println(n.x);
    else System.out.println(n.x);
    if (n!= null) System.out.println(n.x);
    else System.out.println(n.x);

    System.out.println(null!= n? n.hashCode() : 0);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}