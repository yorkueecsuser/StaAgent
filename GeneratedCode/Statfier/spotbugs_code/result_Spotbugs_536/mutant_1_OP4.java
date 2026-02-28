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
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
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
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
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
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
      return 0; // This line is just to avoid compilation issues, it won't be reached
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
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
      return 0; // This line is just to avoid compilation issues, it won't be reached
    }
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to the condition always being false
      return 0; // This line is just to avoid compilation issues, it won't be reached
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}