import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nonnull;

class NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR {

  @Nonnull static Object a;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  static Object b;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  Object x;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  Object y;

  static {
    a = "a";
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't execute because condition is false
      a = "unreachable";
    } else {
      // This else block is also unreachable due to the way we will set condition
      a = "also unreachable";
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR() {
    x = y = "a";
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't execute because condition is false
      x = "unreachable";
    } else {
      // This else block is also unreachable due to the way we will set condition
      y = "also unreachable";
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(String a) {
    x = a;
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't execute because condition is false
      x = "unreachable";
    } else {
      // This else block is also unreachable due to the way we will set condition
      x = "also unreachable";
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(int z) {
    this();
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't execute because condition is false
      x = "unreachable";
    } else {
      // This else block is also unreachable due to the way we will set condition
      y = "also unreachable";
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(double z) {
    super();
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't execute because condition is false
      x = "unreachable";
    } else {
      // This else block is also unreachable due to the way we will set condition
      y = "also unreachable";
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is always false at runtime
  }
}