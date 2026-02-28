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

  // Mutated code
  @Nonnull private Object a;

  //
  // The InconsistentAnnotations detector should report
  // a warning here.
  //
  @ExpectWarning("NP")
  public void b(@Nullable Object c) {
    this.a = c;
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public void d(@CheckForNull Object e) {
    this.a = e;
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int f(@CheckForNull Object g) {
    return g.hashCode();
  }

  //
  // FindNullDeref should report a warning here.
  //
  @ExpectWarning("NP")
  public int h(@CheckForNull Object i) {
    return j(i);
  }

  public int j(@Nonnull Object k) {
    return k.hashCode();
  }
}