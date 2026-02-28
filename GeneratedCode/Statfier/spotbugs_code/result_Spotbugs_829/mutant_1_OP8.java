import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    this.o.toString();
  }

  // Mutated code
  @CheckForNull final Object a = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void bar(@Nonnull Object a) {
    this.a.toString();
  }
}