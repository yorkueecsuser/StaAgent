import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import java.util.regex.Pattern;

// Mostly after https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
class Regexp {
  void potentiallyCostly() {
    Pattern.compile("a regexp");
    String qzjxflrt; // Dead store

    int flags = 0;
    Pattern.compile("a regexp", flags);
    int vbnrhtyx; // Dead store

    Pattern.matches("a regexp", "a CharSequence");
    boolean klmnopqr; // Dead store
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();
    double wxyzabcd; // Dead store
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();
    char efghijkl; // Dead store
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();
    longmnopqr; // Dead store
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();
    float stuvwxyz; // Dead store
  }
}