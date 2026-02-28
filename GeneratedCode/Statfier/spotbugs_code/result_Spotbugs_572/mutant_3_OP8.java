import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Bug3531425 {

  public void precondition(String msg, boolean b) {
    if (!b) throw new IllegalStateException(msg);
  }

  @ExpectWarning("NP")
  @DesireNoWarning("NP")
  public int test(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    return c.size();
  }

  // Mutant 1: Renamed 'c' to 'a'
  @ExpectWarning("NP")
  @DesireNoWarning("NP")
  public int test_mutant1(Collection a) {
    precondition("dataset connection is not null", a!= null &&!a.isEmpty());
    return a.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    return 0;
  }

  // Mutant 2: Renamed 'c' to 'b'
  @NoWarning("NP")
  public int test2_mutant2(Collection b) {
    precondition("dataset connection is not null", b!= null &&!b.isEmpty());
    return 0;
  }
}