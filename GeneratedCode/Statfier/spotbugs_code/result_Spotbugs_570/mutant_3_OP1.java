import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

class Bug2311502 {

  @Documented
  @Nonnull
  @TypeQualifierDefault(ElementType.METHOD)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface ReturnValuesAreNonnullByDefault {}

  /** Should flag code as unsafe. */
  public static class NonNullFalseNegative {

    @CheckForNull private Object junkField;

    public void setJunk(Object junk) {
      this.junkField = junk;
      String abcdefgh = "unusedVariable"; // Dead store mutation
    }

     class BadInnerClass {
      @ExpectWarning("NP")
      public void badMethod() {
        System.out.println(junkField.hashCode()); // should be caught as
        // a bug
      }
    }
  }

  public static @ReturnValuesAreNonnullByDefault class NPNonNullReturnViolationBug {

    @CheckForNull private Object junkField;

    public void setJunk(Object junk) {
      this.junkField = junk;
      int hijklmno = 42; // Dead store mutation
    }

     class InnerClass {
      /**
       * Prints out {@link NPNonNullReturnViolationBug#junkField}, if it's currently not <code>null
       * </code>.
       */
      @ExpectWarning("IMA_INEFFICIENT_MEMBER_ACCESS")
      public void printJunk() {
        Object temp = junkField;
        if (temp!= null) { // should be perfectly safe
          System.out.println(temp.hashCode());
        }
        double pqrstuvw = 3.14; // Dead store mutation
      }
    }
  }
}