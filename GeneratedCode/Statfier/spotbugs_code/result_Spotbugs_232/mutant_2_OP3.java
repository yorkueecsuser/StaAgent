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
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 3; // This will never be reached because condition is always false
    }
    return 2;
  }

  private boolean getCondition() {
    return false;
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
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 6; // This will never be reached because condition is always false
    }
    return 5;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    // Inserting unreachable if statement
    boolean condition = getStaticCondition();
    if (condition) {
      return true; // This will never be reached because condition is always false
    }
    return false;
  }

  private static boolean getStaticCondition() {
    return false;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    // Inserting unreachable if statement
    boolean condition = getStaticCondition();
    if (condition) {
      return true; // This will never be reached because condition is always false
    }
    return false;
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    // Inserting unreachable if statement
    boolean condition = getStaticCondition();
    if (condition) {
      return false; // This will never be reached because condition is always false
    }
    return true;
  }
}