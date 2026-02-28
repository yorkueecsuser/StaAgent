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
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
    }
    field = param;
  }

  @ExpectWarning("NP")
  public void setField(Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
    }
    field = param;
  }

  @ExpectWarning("NP")
  public void setField2(@CheckForNull Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
    }
    field = param;
  }

  @ExpectWarning("NP")
  @Nonnull
  public static Object getParam(Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
    }
    return param;
  }

  @ExpectWarning("NP")
  public int getHash(Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable else branch
    }
    return param.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}