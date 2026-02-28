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
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  @Override
  public int hashCode() {
    return x.hashCode() + y.hashCode() + z.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}