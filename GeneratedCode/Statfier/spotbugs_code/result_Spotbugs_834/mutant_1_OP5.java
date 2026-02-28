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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case.");
        break;
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}