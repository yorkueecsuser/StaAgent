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

  // Mutated code
  @ExpectWarning("NP")
  @DesireNoWarning("NP")
  public int testa(Collection x) {
    precondition("dataset connection is not null", x!= null &&!x.isEmpty());
    return x.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    return 0;
  }

  // Mutated code
  @NoWarning("NP")
  public int test2b(Collection y) {
    precondition("dataset connection is not null", y!= null &&!y.isEmpty());
    return 0;
  }
}