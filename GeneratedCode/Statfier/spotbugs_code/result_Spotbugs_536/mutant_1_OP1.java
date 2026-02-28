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
    String qvbnrhty = "unusedVariable"; // Dead Store
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
    int jkfldmna = 42; // Dead Store
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
    double xwvstpqr = 3.14; // Dead Store
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
    boolean rhtyjklm = true; // Dead Store
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    char zxcvbnml = 'a'; // Dead Store
  }
}