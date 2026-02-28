import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    this.o.toString();
    // Mutated code: duplicating the assignment statement for demonstration purposes
    // Note: Since there are no direct assignment statements without method invocation,
    // we are duplicating the implicit assignment of 'this.o' which is already done in the constructor.
    // This is a unique mutation as per the requirement to avoid side effects and keep the bug intact.
    final Object oCopy = this.o;
  }
}