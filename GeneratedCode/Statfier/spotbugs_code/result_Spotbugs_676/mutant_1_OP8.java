import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nonnull;

class Ideas_2011_08_05 {

  public String returnNonnull() {
    return "x";
  }

  @NoWarning("RCN")
  public int test1() {
    String x = Preconditions.checkNotNull(returnNonnull());
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    Preconditions.checkNotNull(x);
    return h;
  }

  @NoWarning("RCN")
  public int test4() {
    String x = returnNonnull();
    if (x == null) throw new RuntimeException();
    return x.hashCode();
  }

  public int test4OK() {
    String x = returnNonnull();
    if (x == null) System.out.println("Oops");
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test5(@Nonnull String x) {
    if (x == null) throw new RuntimeException();
    return x.hashCode();
  }

  public int test5OK(@Nonnull String x) {
    if (x == null) System.out.println("Oops");
    return x.hashCode();
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6(String x) {
    int h = x.hashCode();
    if (x == null) throw new RuntimeException();
    return h;
  }

  public int test6OK(String x) {
    int h = x.hashCode();
    if (x == null) System.out.println("Oops");
    return h;
  }

  static class Subclass extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String x) {
      Preconditions.checkNotNull(x);
      return x.hashCode();
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();

      return x.hashCode();
    }
  }

  // Mutated code
  @NoWarning("RCN")
  public int test1Mutated() {
    String a = Preconditions.checkNotNull(returnNonnull());
    return a.hashCode();
  }

  @NoWarning("RCN")
  public int test3Mutated(String b) {
    int c = b.hashCode();
    Preconditions.checkNotNull(b);
    return c;
  }

  @NoWarning("RCN")
  public int test4Mutated() {
    String d = returnNonnull();
    if (d == null) throw new RuntimeException();
    return d.hashCode();
  }

  public int test5OKMutated(@Nonnull String e) {
    if (e == null) System.out.println("Oops");
    return e.hashCode();
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6Mutated(String f) {
    int g = f.hashCode();
    if (f == null) throw new RuntimeException();
    return g;
  }

  static class SubclassMutated extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String h) {
      Preconditions.checkNotNull(h);
      return h.hashCode();
    }

    @Override
    @NoWarning("RCN")
    public int test5(String i) {
      if (i == null) throw new RuntimeException();
      return i.hashCode();
    }
  }
}