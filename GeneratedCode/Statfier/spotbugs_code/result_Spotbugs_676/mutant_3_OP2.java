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
    String x_duplicate = Preconditions.checkNotNull(returnNonnull()); // Mutant
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    Preconditions.checkNotNull(x); // Mutant
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    int h_duplicate = x.hashCode(); // Mutant
    Preconditions.checkNotNull(x);
    return h;
  }

  @NoWarning("RCN")
  public int test4() {
    String x = returnNonnull();
    String x_duplicate = returnNonnull(); // Mutant
    if (x == null) throw new RuntimeException();
    return x.hashCode();
  }

  public int test4OK() {
    String x = returnNonnull();
    String x_duplicate = returnNonnull(); // Mutant
    if (x == null) System.out.println("Oops");
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test5(@Nonnull String x) {
    if (x == null) throw new RuntimeException();
    if (x == null) throw new RuntimeException(); // Mutant
    return x.hashCode();
  }

  public int test5OK(@Nonnull String x) {
    if (x == null) System.out.println("Oops");
    if (x == null) System.out.println("Oops"); // Mutant
    return x.hashCode();
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6(String x) {
    int h = x.hashCode();
    int h_duplicate = x.hashCode(); // Mutant
    if (x == null) throw new RuntimeException();
    return h;
  }

  public int test6OK(String x) {
    int h = x.hashCode();
    int h_duplicate = x.hashCode(); // Mutant
    if (x == null) System.out.println("Oops");
    return h;
  }

  static class Subclass extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String x) {
      Preconditions.checkNotNull(x);
      Preconditions.checkNotNull(x); // Mutant
      return x.hashCode();
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();
      if (x == null) throw new RuntimeException(); // Mutant

      return x.hashCode();
    }
  }
}