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
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void report2(@CheckForNull Object bar) {
    this.foo = bar;
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report3(@CheckForNull Object bar) {
    return bar.hashCode();
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int report4(@CheckForNull Object bar) {
    return nonnull(bar);
  }

  public int nonnull(@Nonnull Object bar) {
    return bar.hashCode();
  }

  //
  // Mutant code starts here
  //
  @ExpectWarning("NP")
  public void report1Mutant(@Nullable Object x) {
    this.foo = x;
  }

  @ExpectWarning("NP")
  public void report2Mutant(@CheckForNull Object y) {
    this.foo = y;
  }

  @ExpectWarning("NP")
  public int report3Mutant(@CheckForNull Object z) {
    return z.hashCode();
  }

  @ExpectWarning("NP")
  public int report4Mutant(@CheckForNull Object w) {
    return nonnull(w);
  }

  public int nonnullMutant(@Nonnull Object v) {
    return v.hashCode();
  }
}