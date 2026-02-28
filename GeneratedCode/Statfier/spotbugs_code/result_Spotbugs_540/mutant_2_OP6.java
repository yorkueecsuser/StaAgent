import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will always return false
    }
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will always return false
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will always return false
    }
    return test;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loops unreachable
  }
}