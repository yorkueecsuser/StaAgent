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

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}