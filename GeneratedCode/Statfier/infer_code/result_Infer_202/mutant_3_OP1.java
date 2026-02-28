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
    
    // Dead store mutation
    String jxqftrbn = "unused";
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();
    
    // Dead store mutation
    int qzvbnrht = 42;
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();
    
    // Dead store mutation
    boolean vjfnbqtr = true;
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();
    
    // Dead store mutation
    double kxjvbnrt = 3.14;
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();
    
    // Dead store mutation
    char hqjvbnrt = 'a';
  }
}