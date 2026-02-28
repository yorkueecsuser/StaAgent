import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

/**
 * Bug pattern suggested by Curtis Light and Kevin Bourrillion. Variations on test1 version occur
 * 80+ times in Google's codebase.
 */
class Ideas_2011_07_25 {

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public int test1(Object x) {
    Preconditions.checkNotNull("x should be nonnull", x);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
    return x.hashCode();
  }

  @ExpectWarning("DMI")
  public void test0(Object x) {
    Preconditions.checkNotNull("x should be nonnull");
    this.x = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  private Object x;

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void setX(Object x) {
    Preconditions.checkNotNull("x should be nonnull", x);
    this.x = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public Object getX() {
    Preconditions.checkNotNull("x should be nonnull", x);
    return x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  @NoWarning(
      value = "RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE",
      confidence = Confidence.MEDIUM)
  public int test2(Object x) {
    int result = x.hashCode();
    Preconditions.checkNotNull(x, "x should be nonnull");
    return result;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test3(Object x) {
    if (x == null) System.out.println("Oops");
    Preconditions.checkNotNull(x, "x should be nonnull");
    return x.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public int test3a(Object x) {
    if (x == null) return 42;
    Preconditions.checkNotNull(x, "x should be nonnull");
    return x.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test4(Object x) {
    if (x == null) System.out.println("Oops");
    Preconditions.checkNotNull(x, "x should be nonnull");
    return 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test5(Object x) {
    if (x!= null) return 0;
    Preconditions.checkNotNull(x, "x should be nonnull");
    return 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test6(Object x) {
    if (x == null) System.out.println("Oops");
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return x.hashCode();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test7(Object x) {
    if (x == null) System.out.println("Oops");
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  public int test8(Object x) {
    if (x!= null) return 0;
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}