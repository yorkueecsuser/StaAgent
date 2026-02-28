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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }

  @Override
  public int hashCode() {
    return x.hashCode() + y.hashCode() + z.hashCode();
  }
}