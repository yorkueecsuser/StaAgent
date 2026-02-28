import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import java.util.regex.Pattern;

// Mostly after https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
class Regexp {
  void potentiallyCostly() {
    Pattern.compile("a regexp");
    String qzjfnxvt; // Dead store

    int flags = 0;
    Pattern.compile("a regexp", flags);
    int rhtybnmk; // Dead store

    Pattern.matches("a regexp", "a CharSequence");
    boolean lmjhgffd; // Dead store
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();
    char wqertpoi; // Dead store
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();
    double yuiopasd; // Dead store
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();
    long zxcvbnml; // Dead store
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();
    float asdfghjk; // Dead store
  }
}