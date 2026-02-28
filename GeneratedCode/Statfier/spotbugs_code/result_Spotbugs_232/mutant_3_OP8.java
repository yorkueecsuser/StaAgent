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
    if (x == getString()) return 2;
    if (getInteger() == x) return 3;
    if (x == getInteger()) return 4;
    if (getInteger() == getInteger()) return 5;
    if (getString() == getString()) return 5;
    return 5;
  }

  // Mutant 1: Renaming 'x' to 'a'
  @NoWarning("EC")
  @ExpectWarning("ES,RC")
  public int checkMutant1(Object a) {
    if (getString() == a) return 1;
    if (a == getString()) return 2;
    if (getInteger() == a) return 3;
    if (a == getInteger()) return 4;
    if (getInteger() == getInteger()) return 5;
    if (getString() == getString()) return 5;
    return 5;
  }

  @ExpectWarning("EC")
  public static boolean findIntInStringCollection(Integer x, Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); ) if (x.equals(i.next())) return true;
    return false;
  }

  // Mutant 2: Renaming 'i' to 'b'
  @ExpectWarning("EC")
  public static boolean findIntInStringCollection2(Integer x, Collection<String> c) {
    for (Iterator b = c.iterator(); b.hasNext(); ) if (x.equals(((String) b.next()))) return true;
    return false;
  }

  public static boolean verifyStringCollection(Collection<String> c) {
    for (Iterator<String> i = c.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    return true;
  }

  // Mutant 3: Renaming 'c' to 'd'
  public static boolean verifyStringCollectionMutant1(Collection<String> d) {
    for (Iterator<String> i = d.iterator(); i.hasNext(); )
      if (!(i.next() instanceof String)) return false;
    return true;
  }
}