import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class AnnotationsOnOverridenMethods {

  @Nonnull
  Object foo(@CheckForNull Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in foo method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in foo method.");
    }
    return o;
  }

  Object bar(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in bar method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in bar method.");
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
        // Some unreachable code
        System.out.println("This is unreachable code in overridden foo method.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in overridden foo method.");
      }
      return o;
    }

    @Override
    @CheckForNull
    Object bar(@Nonnull Object o) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code in overridden bar method.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in overridden bar method.");
      }
      return o;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}