import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class Ideas_2009_04_30 {

  public static void main(String args[]) {
    HashMap m = new HashMap();
    System.out.println(m.equals(null));

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    LinkedHashMap lhm = (LinkedHashMap) m;

    ArrayList<String> a = new ArrayList<String>();

    String s[] = (String[]) a.toArray();
    Object x = m;
    HashSet set = (HashSet) x;
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}