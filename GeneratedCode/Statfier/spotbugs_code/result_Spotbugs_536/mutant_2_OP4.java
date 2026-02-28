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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in report1");
    } else {
      // Some unreachable code
      System.out.println("This is also unreachable code in report1");
    }
    this.foo = bar;
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in report2");
    } else {
      // Some unreachable code
      System.out.println("This is also unreachable code in report2");
    }
    this.foo = bar;
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in report3");
    } else {
      // Some unreachable code
      System.out.println("This is also unreachable code in report3");
    }
    return bar.hashCode();
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in report4");
    } else {
      // Some unreachable code
      System.out.println("This is also unreachable code in report4");
    }
    return nonnull(bar);
  }

  public int nonnull(@Nonnull Object bar) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in nonnull");
    } else {
      // Some unreachable code
      System.out.println("This is also unreachable code in nonnull");
    }
    return bar.hashCode();
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}