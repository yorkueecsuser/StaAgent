import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;
import java.util.Set;

class Ideas_2009_10_13<V, K> extends HashMap<K, V> {
  @NoWarning("GC")
  public static <K, V> void falsePositive1(Ideas_2009_10_13<V, K> i, HashMap<K, V> h) {
    if (i.equals(h)) System.out.println("equal");
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  @NoWarning("GC")
  public static void falsePositive2(
      Ideas_2009_10_13<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }
  }

  @DesireWarning("GC")
  public static <K, V> void truePositive(Ideas_2009_10_13<K, V> i, HashMap<K, V> h) {
    if (i.equals(h)) System.out.println("equal");
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable if statement");
    }
  }

  @DesireWarning("GC")
  public static void truePositive2(
      Ideas_2009_10_13<String, Integer> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This unreachable if statement is unique");
    }
  }

  @ExpectWarning("GC")
  public static void truePositive3(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("One more unique unreachable if statement");
    }
  }

  @ExpectWarning("GC")
  public static void truePositive4(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    Set<Entry<Integer, String>> iEntrySet = i.entrySet();
    Set<Entry<String, Integer>> hEntrySet = h.entrySet();
    if (iEntrySet.containsAll(hEntrySet)) System.out.println("i contains h");
    if (hEntrySet.containsAll(iEntrySet)) System.out.println("h contains i");
    hEntrySet.retainAll(iEntrySet);
    hEntrySet.removeAll(iEntrySet);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("And yet another unique unreachable if statement");
    }
  }

  // Method to provide a dynamic condition for the unreachable if statements
  private static boolean getCondition() {
    return false;
  }
}