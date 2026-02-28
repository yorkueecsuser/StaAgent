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
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    Preconditions.checkNotNull(x);
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return h;
  }

  @NoWarning("RCN")
  public int test4() {
    String x = returnNonnull();
    if (x == null) throw new RuntimeException();
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  public int test4OK() {
    String x = returnNonnull();
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  @NoWarning("RCN")
  public int test5(@Nonnull String x) {
    if (x == null) throw new RuntimeException();
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  public int test5OK(@Nonnull String x) {
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return x.hashCode();
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6(String x) {
    int h = x.hashCode();
    if (x == null) throw new RuntimeException();
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return h;
  }

  public int test6OK(String x) {
    int h = x.hashCode();
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("Unreachable case 0");
        break;
    }
    return h;
  }

  static class Subclass extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String x) {
      Preconditions.checkNotNull(x);
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("Unreachable case 0");
          break;
      }
      return x.hashCode();
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("Unreachable case 0");
          break;
      }
      return x.hashCode();
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the switch is unreachable but not a compile-time constant
  }
}