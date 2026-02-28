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
    boolean conditionForStaticBlock = getCondition();
    for (int i = 0; conditionForStaticBlock; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR() {
    x = y = "a";
    boolean conditionForConstructor = getCondition();
    for (int i = 0; conditionForConstructor; i++) {
      // Unreachable loop
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(String a) {
    x = a;
    boolean conditionForStringConstructor = getCondition();
    for (int i = 0; conditionForStringConstructor; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(int z) {
    this();
    boolean conditionForIntConstructor = getCondition();
    for (int i = 0; conditionForIntConstructor; i++) {
      // Unreachable loop
    }
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(double z) {
    super();
    boolean conditionForDoubleConstructor = getCondition();
    for (int i = 0; conditionForDoubleConstructor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}