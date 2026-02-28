import edu.umd.cs.findbugs.annotations.DefaultAnnotationForParameters;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import sfBugs.Bug3399101.ParametersAreCheckForNullByDefault;

@DefaultAnnotationForParameters(CheckForNull.class)
@ParametersAreCheckForNullByDefault
class Bug3399101 {

  @Documented
  @CheckForNull
  @TypeQualifierDefault(ElementType.PARAMETER)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface ParametersAreCheckForNullByDefault {}

  @Nonnull public Object field;

  @ExpectWarning("NP")
  public Bug3399101(Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in constructor");
    }
    field = param;
  }

  @ExpectWarning("NP")
  public void setField(Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in setField");
    }
    field = param;
  }

  @ExpectWarning("NP")
  public void setField2(@CheckForNull Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in setField2");
    }
    field = param;
  }

  @ExpectWarning("NP")
  @Nonnull
  public static Object getParam(Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getParam");
    }
    return param;
  }

  @ExpectWarning("NP")
  public int getHash(Object param) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getHash");
    }
    return param.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}