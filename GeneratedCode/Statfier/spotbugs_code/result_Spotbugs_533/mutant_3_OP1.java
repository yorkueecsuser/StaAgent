import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class AnnotationsOnOverridenMethods {

  @Nonnull
  Object foo(@CheckForNull Object o) {
    String abcdefgh = "unusedVariable"; // Dead store mutation
    return o;
  }

  Object bar(Object o) {
    return o;
  }

  static class Child extends AnnotationsOnOverridenMethods {

    @Override
    @ExpectWarning("NP_METHOD_RETURN_RELAXING_ANNOTATION,NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION")
    @CheckForNull
    Object foo(@Nonnull Object o) {
      int hijklmno = 42; // Dead store mutation
      return o;
    }

    @Override
    @CheckForNull
    Object bar(@Nonnull Object o) {
      boolean pqrstuvw = true; // Dead store mutation
      return o;
    }
  }
}