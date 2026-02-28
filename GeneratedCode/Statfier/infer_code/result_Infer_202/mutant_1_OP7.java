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

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}