import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class AnnotationsOnOverridenMethods {

  @Nonnull
  Object foo(@CheckForNull Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o;
  }

  Object bar(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return o;
  }

  static class Child extends AnnotationsOnOverridenMethods {

    @Override
    @ExpectWarning("NP_METHOD_RETURN_RELAXING_ANNOTATION,NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION")
    @CheckForNull
    Object foo(@Nonnull Object o) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return o;
    }

    @Override
    @CheckForNull
    Object bar(@Nonnull Object o) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return o;
    }
  }

  private boolean getCondition() {
    return false;
  }
}