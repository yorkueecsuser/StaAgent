import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class AnnotationsOnOverridenMethods {

  @Nonnull
  Object foo(@CheckForNull Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
    return o;
  }

  Object bar(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
    return o;
  }

  static class Child extends AnnotationsOnOverridenMethods {

    @Override
    @ExpectWarning("NP_METHOD_RETURN_RELAXING_ANNOTATION,NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION")
    @CheckForNull
    Object foo(@Nonnull Object o) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
        System.out.println("This is an unreachable if block.");
      } else {
        // Some alternative code that should also never run
        System.out.println("This is an unreachable else block.");
      }
      return o;
    }

    @Override
    @CheckForNull
    Object bar(@Nonnull Object o) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
        System.out.println("This is an unreachable if block.");
      } else {
        // Some alternative code that should also never run
        System.out.println("This is an unreachable else block.");
      }
      return o;
    }
  }

  private boolean getCondition() {
    // This method should always return false to ensure the if-else blocks are unreachable
    return false;
  }
}