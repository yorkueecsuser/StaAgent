import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    this.o.toString();
    
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}