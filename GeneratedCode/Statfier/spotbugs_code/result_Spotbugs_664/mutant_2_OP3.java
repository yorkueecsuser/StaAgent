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
      // This block is intentionally left empty to be unreachable
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR() {
    x = y = "a";
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to be unreachable
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(String a) {
    x = a;
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to be unreachable
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(int z) {
    this();
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to be unreachable
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(double z) {
    super();
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to be unreachable
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}