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
    }

     class BadInnerClass {
      @ExpectWarning("NP")
      public void badMethod() {
        System.out.println(junkField.hashCode()); // should be caught as
        // a bug

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This will never be printed");
        } else {
          System.out.println("This will also never be printed");
        }
      }
    }
  }

  public static @ReturnValuesAreNonnullByDefault class NPNonNullReturnViolationBug {

    @CheckForNull private Object junkField;

    public void setJunk(Object junk) {
      this.junkField = junk;
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

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This will never be printed");
        } else {
          System.out.println("This will also never be printed");
        }
      }
    }
  }

  // Method to provide a dynamic condition for the if-else statement
  private static boolean getCondition() {
    return false; // This method can be further modified to return dynamic values
  }
}