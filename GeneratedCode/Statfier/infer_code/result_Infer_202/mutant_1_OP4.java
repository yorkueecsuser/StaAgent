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

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This will never be printed");
    } else {
      // Alternative code that also should never run
      System.out.println("This will also never be printed");
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}