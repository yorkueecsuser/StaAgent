import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class Bug2003253 {
  @Nonnull private Object foo;

  //
  // The InconsistentAnnotations detector should report
  // a warning here.
  //
  @ExpectWarning("NP")
  public void report1(@Nullable Object bar) {
    this.foo = bar;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block should always execute
      System.out.println("This is an always reachable else block.");
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block should always execute
      System.out.println("This is an always reachable else block.");
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block should always execute
      System.out.println("This is an always reachable else block.");
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block should always execute
      System.out.println("This is an always reachable else block.");
    }
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block should always execute
      System.out.println("This is an always reachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition is dynamically determined at runtime
  }
}