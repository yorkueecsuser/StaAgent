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
    field = param;
    String jxqfzvbn = "unused"; // Dead Store
  }

  @ExpectWarning("NP")
  public void setField(Object param) {
    field = param;
    int khtyvmnr = 42; // Dead Store
  }

  @ExpectWarning("NP")
  public void setField2(@CheckForNull Object param) {
    field = param;
    boolean wjxqfzvbn = true; // Dead Store
  }

  @ExpectWarning("NP")
  @Nonnull
  public static Object getParam(Object param) {
    return param;
    char gkhtyvmnr = 'a'; // Dead Store
  }

  @ExpectWarning("NP")
  public int getHash(Object param) {
    return param.hashCode();
    double swjxqfzvbn = 3.14; // Dead Store
  }
}