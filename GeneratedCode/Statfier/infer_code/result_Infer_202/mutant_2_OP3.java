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

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}