import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class Ideas_2009_04_30 {

  public static void main(String args[]) {
    HashMap m = new HashMap();
    System.out.println(m.equals(null));

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
      System.out.println("This loop is unreachable");
    }

    LinkedHashMap lhm = (LinkedHashMap) m;

    ArrayList<String> a = new ArrayList<String>();

    String s[] = (String[]) a.toArray();
    Object x = m;
    HashSet set = (HashSet) x;
  }

  // Method to provide a dynamic condition that will be false
  private static boolean getCondition() {
    return false;
  }
}