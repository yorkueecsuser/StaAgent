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
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test1");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test1");
    }
    Preconditions.checkNotNull("x should be nonnull", x);
    return x.hashCode();
  }

  @ExpectWarning("DMI")
  public void test0(Object x) {
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test0");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test0");
    }
    Preconditions.checkNotNull("x should be nonnull");
    this.x = x;
  }

  private Object x;

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public void setX(Object x) {
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in setX");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in setX");
    }
    Preconditions.checkNotNull("x should be nonnull", x);
    this.x = x;
  }

  @ExpectWarning("DMI_ARGUMENTS_WRONG_ORDER")
  public Object getX() {
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in getX");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in getX");
    }
    Preconditions.checkNotNull("x should be nonnull", x);
    return x;
  }

  @NoWarning(
      value = "RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE",
      confidence = Confidence.MEDIUM)
  public int test2(Object x) {
    int result = x.hashCode();
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test2");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test2");
    }
    Preconditions.checkNotNull(x, "x should be nonnull");
    return result;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test3");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test3");
    }
    Preconditions.checkNotNull(x, "x should be nonnull");
    return x.hashCode();
  }

  @NoWarning(value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE", confidence = Confidence.MEDIUM)
  public int test3a(Object x) {
    if (x == null) return 42;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test3a");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test3a");
    }
    Preconditions.checkNotNull(x, "x should be nonnull");
    return x.hashCode();
  }

  public int test4(Object x) {
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test4");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test4");
    }
    Preconditions.checkNotNull(x, "x should be nonnull");
    return 42;
  }

  public int test5(Object x) {
    if (x!= null) return 0;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test5");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test5");
    }
    Preconditions.checkNotNull(x, "x should be nonnull");
    return 42;
  }

  public int test6(Object x) {
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test6");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test6");
    }
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return x.hashCode();
  }

  public int test7(Object x) {
    if (x == null) System.out.println("Oops");
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test7");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test7");
    }
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return 42;
  }

  public int test8(Object x) {
    if (x!= null) return 0;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in test8");
    } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in test8");
    }
    Preconditions.checkArgument(x!= null, "x should be nonnull");
    return 42;
  }

  private boolean getCondition() {
    return false;
  }
}