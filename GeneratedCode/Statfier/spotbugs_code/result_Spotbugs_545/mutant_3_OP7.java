import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

class MethodLevel {
  public String method() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return methodNonNull(test);
  }

  @ParametersAreNonnullByDefault
  private String methodNonNull(final String test) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return test;
  }

  private boolean getCondition() {
    return false;
  }
}