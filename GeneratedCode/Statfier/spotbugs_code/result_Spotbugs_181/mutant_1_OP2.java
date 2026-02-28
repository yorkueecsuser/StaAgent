import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Ideas_2009_10_13a {

  @ExpectWarning("GC")
  public static void truePositive3(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().retainAll(i.entrySet()); // Mutant: duplicated retainAll call
    h.entrySet().removeAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet()); // Mutant: duplicated removeAll call
  }

  @ExpectWarning("GC")
  public static void truePositive4(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    Set<Entry<Integer, String>> iEntrySet = i.entrySet();
    Set<Entry<Integer, String>> iEntrySetCopy = i.entrySet(); // Mutant: duplicated assignment
    Set<Entry<String, Integer>> hEntrySet = h.entrySet();
    Set<Entry<String, Integer>> hEntrySetCopy = h.entrySet(); // Mutant: duplicated assignment
    if (iEntrySet.containsAll(hEntrySet)) System.out.println("i contains h");
    if (hEntrySet.containsAll(iEntrySet)) System.out.println("h contains i");
    hEntrySet.retainAll(iEntrySet);
    hEntrySet.retainAll(iEntrySet); // Mutant: duplicated retainAll call
    hEntrySet.removeAll(iEntrySet);
    hEntrySet.removeAll(iEntrySet); // Mutant: duplicated removeAll call
  }
}