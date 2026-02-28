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

  // Mutant for test1
  @NoWarning("RCN")
  public int test1Mutant() {
    String a = Preconditions.checkNotNull(returnNonnull());
    return a.hashCode();
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    return x.hashCode();
  }

  // Mutant for test2
  @NoWarning("RCN")
  public int test2Mutant(@Nonnull String y) {
    Preconditions.checkNotNull(y);
    return y.hashCode();
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    Preconditions.checkNotNull(x);
    return h;
  }

  // Mutant for test3
  @NoWarning("RCN")
  public int test3Mutant(String z) {
    int b = z.hashCode();
    Preconditions.checkNotNull(z);
    return b;
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

  // Mutant for test6
  @NoWarning(value = "RCN", rank = 8)
  public int test6Mutant(String y) {
    int c = y.hashCode();
    if (y == null) throw new RuntimeException();
    return c;
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

    // Mutant for Subclass test2
    @Override
    @NoWarning("RCN")
    public int test2Mutant(String y) {
      Preconditions.checkNotNull(y);
      return y.hashCode();
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();

      return x.hashCode();
    }

    // Mutant for Subclass test5
    @Override
    @NoWarning("RCN")
    public int test5Mutant(String y) {
      if (y == null) throw new RuntimeException();

      return y.hashCode();
    }
  }
}