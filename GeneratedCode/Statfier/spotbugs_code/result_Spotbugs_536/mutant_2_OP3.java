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
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      this.foo = new Object();
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      this.foo = new Object();
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 0;
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 0;
    }
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 0;
    }
  }

  private boolean getCondition() {
    return false;
  }
}