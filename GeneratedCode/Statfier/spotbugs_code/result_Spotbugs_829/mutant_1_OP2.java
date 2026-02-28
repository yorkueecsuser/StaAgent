import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    this.o.toString();
    // Mutant: Duplicating the assignment statement for demonstration purposes
    // Note: The original code does not have an assignment statement without method invocation,
    // but for the sake of mutation, we will duplicate the initialization of 'o' in a different context.
    @CheckForNull final Object oCopy = new Object(); // This is a unique mutant addition
  }
}