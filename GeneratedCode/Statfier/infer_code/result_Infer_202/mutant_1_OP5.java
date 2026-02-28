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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
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
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}