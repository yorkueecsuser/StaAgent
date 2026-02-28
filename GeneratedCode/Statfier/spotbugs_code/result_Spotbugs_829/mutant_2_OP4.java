import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    this.o.toString();
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}