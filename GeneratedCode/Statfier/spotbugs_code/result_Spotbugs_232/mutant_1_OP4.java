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
    return 2;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return 3; // This branch is unreachable because condition is never set to true
    } else {
      return 4; // This branch is also unreachable
    }
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
    return 5;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return 6; // This branch is unreachable because condition is never set to true
    } else {
      return 7; // This branch is also unreachable
    }
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return true; // This branch is unreachable because condition is never set to true
    } else {
      return false; // This branch is also unreachable
    }
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return true; // This branch is unreachable because condition is never set to true
    } else {
      return false; // This branch is also unreachable
    }
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    return true;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return false; // This branch is unreachable because condition is never set to true
    } else {
      return true; // This branch is also unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}