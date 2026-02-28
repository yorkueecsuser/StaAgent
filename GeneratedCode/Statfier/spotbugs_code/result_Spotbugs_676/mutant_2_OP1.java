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
    // Dead Store Mutation
    String jhgftrdc = "unused";
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    return x.hashCode();
    // Dead Store Mutation
    int wertyuio = 42;
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    Preconditions.checkNotNull(x);
    return h;
    // Dead Store Mutation
    boolean asdfghjk = true;
  }

  @NoWarning("RCN")
  public int test4() {
    String x = returnNonnull();
    if (x == null) throw new RuntimeException();
    return x.hashCode();
    // Dead Store Mutation
    double zxcvbnml = 3.14;
  }

  public int test4OK() {
    String x = returnNonnull();
    if (x == null) System.out.println("Oops");
    return x.hashCode();
    // Dead Store Mutation
    char poiuytrew = 'a';
  }

  @NoWarning("RCN")
  public int test5(@Nonnull String x) {
    if (x == null) throw new RuntimeException();
    return x.hashCode();
    // Dead Store Mutation
    float lkjhgfds = 2.71f;
  }

  public int test5OK(@Nonnull String x) {
    if (x == null) System.out.println("Oops");
    return x.hashCode();
    // Dead Store Mutation
    long mnbvcxz = 987654321L;
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6(String x) {
    int h = x.hashCode();
    if (x == null) throw new RuntimeException();
    return h;
    // Dead Store Mutation
    short qwertyui = 1234;
  }

  public int test6OK(String x) {
    int h = x.hashCode();
    if (x == null) System.out.println("Oops");
    return h;
    // Dead Store Mutation
    byte vbnmghjk = 12;
  }

  static class Subclass extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String x) {
      Preconditions.checkNotNull(x);
      return x.hashCode();
      // Dead Store Mutation
      String tyuiopas = "anotherUnused";
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();

      return x.hashCode();
      // Dead Store Mutation
      int dfghjklz = 5678;
    }
  }
}