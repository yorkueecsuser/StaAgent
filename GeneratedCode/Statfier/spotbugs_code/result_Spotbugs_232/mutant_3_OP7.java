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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
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
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
    }
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
    }
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
    }
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    return true;
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
    }
  }

  private boolean getCondition() {
    // This method returns a condition that is never set to true in the context of these methods
    return false;
  }
}