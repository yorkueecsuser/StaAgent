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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  @NoWarning("RCN")
  public int test2(@Nonnull String x) {
    Preconditions.checkNotNull(x);
    return x.hashCode();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  @NoWarning("RCN")
  public int test3(String x) {
    int h = x.hashCode();
    Preconditions.checkNotNull(x);
    return h;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  @NoWarning("RCN")
  public int test4() {
    String x = returnNonnull();
    if (x == null) throw new RuntimeException();
    return x.hashCode();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  public int test4OK() {
    String x = returnNonnull();
    if (x == null) System.out.println("Oops");
    return x.hashCode();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  @NoWarning("RCN")
  public int test5(@Nonnull String x) {
    if (x == null) throw new RuntimeException();
    return x.hashCode();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  public int test5OK(@Nonnull String x) {
    if (x == null) System.out.println("Oops");
    return x.hashCode();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  @NoWarning(value = "RCN", rank = 8)
  public int test6(String x) {
    int h = x.hashCode();
    if (x == null) throw new RuntimeException();
    return h;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  public int test6OK(String x) {
    int h = x.hashCode();
    if (x == null) System.out.println("Oops");
    return h;
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
    }
  }

  static class Subclass extends Ideas_2011_08_05 {
    @Override
    @NoWarning("RCN")
    public int test2(String x) {
      Preconditions.checkNotNull(x);
      return x.hashCode();
      // Unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case 0");
          break;
      }
    }

    @Override
    @NoWarning("RCN")
    public int test5(String x) {
      if (x == null) throw new RuntimeException();
      return x.hashCode();
      // Unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case 0");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}