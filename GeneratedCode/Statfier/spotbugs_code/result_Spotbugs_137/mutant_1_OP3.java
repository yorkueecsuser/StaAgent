import com.google.inject.Inject;
import org.apache.tapestry.spring.SpringBean;

/**
 * With annotations and inversion of control being all the rage these days, a new pattern seems to
 * be gaining popularity: annotating class fields with something like '@SpringBean' (wicket/spring)
 * or '@Inject' (Google Guice), and somehow have them instantiated by reflection by the framework.
 */
class Bug1718130 {
  @Inject Object x;

  @SpringBean Object y;

  Object z;

  Bug1718130() {
    z = y;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      x = new Object();
    }
  }

  @Override
  public int hashCode() {
    return x.hashCode() + y.hashCode() + z.hashCode();
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}