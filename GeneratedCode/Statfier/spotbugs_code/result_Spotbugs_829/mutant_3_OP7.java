import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3049405 {
  @CheckForNull final Object o = new Object();

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public void foo(@Nonnull Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
    this.o.toString();
  }

  private boolean getCondition() {
    return false;
  }
}