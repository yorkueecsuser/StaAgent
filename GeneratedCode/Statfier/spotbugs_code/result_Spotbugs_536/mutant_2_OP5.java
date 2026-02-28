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
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is unreachable");
        break;
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 2:
        // This case is unreachable because getValue(condition) will never return 2
        System.out.println("This is unreachable");
        break;
    }
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 3:
        // This case is unreachable because getValue(condition) will never return 3
        System.out.println("This is unreachable");
        break;
    }
    return 0; // Added to avoid unreachable statement error
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 4:
        // This case is unreachable because getValue(condition) will never return 4
        System.out.println("This is unreachable");
        break;
    }
    return 0; // Added to avoid unreachable statement error
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 5:
        // This case is unreachable because getValue(condition) will never return 5
        System.out.println("This is unreachable");
        break;
    }
    return 0; // Added to avoid unreachable statement error
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it's not a compile-time constant
  }

  private int getValue(boolean condition) {
    return condition? 0 : 0; // This method always returns 0, making the switch cases unreachable
  }
}