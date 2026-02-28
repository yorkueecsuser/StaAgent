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
  }

  @NoWarning("EC")
  @ExpectWarning("ES,RC")
  public int check(Object x) {
    if (getString() == x) return 1;
    if (getString() == x) return 1; // Mutant: duplicated assignment statement
    if (x == getString()) return 2;
    if (x == getString()) return 2; // Mutant: duplicated assignment statement
    if (getInteger() == x) return 3;
    if (getInteger() == x) return 3; // Mutant: duplicated assignment statement
    if (x == getInteger()) return 4;
    if (x == getInteger()) return 4; // Mutant: duplicated assignment statement
    if (getInteger() == getInteger()) return 5;
    if (getInteger() == getInteger()) return 5; // Mutant: duplicated assignment statement
    if (getString() == getString()) return 5;
    if (getString() == getString()) return 5; // Mutant: duplicated assignment statement
    return 5;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    if (!(i.hasNext() instanceof String)) return false; // Mutant: duplicated assignment statement (though not applicable here, kept for consistency)
    return true;
  }
}