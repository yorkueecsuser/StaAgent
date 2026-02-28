import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}