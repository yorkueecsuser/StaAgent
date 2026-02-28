import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class AnnotationsOnOverridenMethods {

  @Nonnull
  Object foo(@CheckForNull Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
    return o;
  }

  Object bar(Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
    return o;
  }

  static class Child extends AnnotationsOnOverridenMethods {

    @Override
    @ExpectWarning("NP_METHOD_RETURN_RELAXING_ANNOTATION,NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION")
    @CheckForNull
    Object foo(@Nonnull Object o) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
      return o;
    }

    @Override
    @CheckForNull
    Object bar(@Nonnull Object o) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
      return o;
    }
  }

  private boolean getCondition() {
    // This method should return false to ensure the else branch is unreachable
    return false;
  }
}