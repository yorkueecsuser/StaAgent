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

  // Mutant code
  void potentiallyCostlyMutant() {
    Pattern.compile("a regexp");

    int x = 0; // Renamed 'flags' to 'x'
    Pattern.compile("a regexp", x);

    Pattern.matches("a regexp", "a CharSequence");
  }

  @UiThread
  void annotatedBadMutant() {
    potentiallyCostlyMutant();
  }

  // no evidence on main thread so OK
  void noThreadOkMutant() {
    potentiallyCostlyMutant();
  }

  @WorkerThread
  void workerThreadOkMutant() {
    potentiallyCostlyMutant();
  }

  void assertedBadMutant() {
    OurThreadUtils.assertMainThread();
    potentiallyCostlyMutant();
  }
}