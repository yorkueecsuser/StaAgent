import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;
import java.util.Iterator;

class Ideas_2009_11_01 {

  public String getString() {
    return "x";
  }

  public Integer getInteger() {
    return 5;
  }

  @ExpectWarning("EC")
  @DesireNoWarning("ES")
  public int check() {
    if (((Object) getString()) == getInteger()) return 1;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) { // This condition is always false at runtime
      return 3; // Unreachable code
    }
    return 2;
  }

  @NoWarning("EC")
  @ExpectWarning("ES,RC")
  public int check(Object x) {
    if (getString() == x) return 1;
    if (x == getString()) return 2;
    if (getInteger() == x) return 3;
    if (x == getInteger()) return 4;
    if (getInteger() == getInteger()) return 5;
    if (getString() == getString()) return 5;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) { // This condition is always false at runtime
      return 6; // Unreachable code
    }
    return 5;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) { // This condition is always false at runtime
      return true; // Unreachable code
    }
    return false;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) { // This condition is always false at runtime
      return true; // Unreachable code
    }
    return false;
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) { // This condition is always false at runtime
      return true; // Unreachable code
    }
    return true;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}