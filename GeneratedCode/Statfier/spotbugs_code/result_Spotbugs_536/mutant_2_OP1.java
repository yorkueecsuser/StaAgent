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
    String xqjvbnrt = "unused"; // Dead store mutation
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
    int mnpqrstu = 42; // Dead store mutation
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
    boolean pqwertyu = true; // Dead store mutation
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
    double abcdghij = 3.14; // Dead store mutation
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
    char klmnopqr = 'a'; // Dead store mutation
  }
}