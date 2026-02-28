import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class EvenUnknownTypesAreNotRecursive {

  /** Really, we want this to be a class that is not available for analysis */
  static class A {}

  /**
   * @param args
   */
  @ExpectWarning("DMI,GC")
  public static void main(String args[]) {

    Set<A> sa = new HashSet<A>();
    Set<A> sa2 = new HashSet<A>();

    TreeSet<A> tsa2 = new TreeSet<A>();

    sa.contains(sa);
    sa.contains(sa2);
    sa.contains(tsa2);

    sa.containsAll(sa);
    sa.containsAll(sa2);
    sa.containsAll(tsa2);

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      // This is the unreachable else block
      System.out.println("This will never run");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}