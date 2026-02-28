import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import java.util.regex.Pattern;

// Mostly after https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
class Regexp {
  void potentiallyCostly() {
    Pattern.compile("a regexp");

    int flags = 0;
    Pattern.compile("a regexp", flags);

    Pattern.matches("a regexp", "a CharSequence");

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is always false
    }
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is always false
    }
  }

  // Helper method to simulate a condition that is always false
  private boolean getCondition() {
    return false;
  }
}