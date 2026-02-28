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

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is unreachable code due to condition being false.");
    }
  }

  @UiThread
  void annotatedBad() {
    potentiallyCostly();

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable code in annotatedBad.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is unreachable code in annotatedBad due to condition being false.");
    }
  }

  // no evidence on main thread so OK
  void noThreadOk() {
    potentiallyCostly();

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable code in noThreadOk.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is unreachable code in noThreadOk due to condition being false.");
    }
  }

  @WorkerThread
  void workerThreadOk() {
    potentiallyCostly();

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable code in workerThreadOk.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is unreachable code in workerThreadOk due to condition being false.");
    }
  }

  void assertedBad() {
    OurThreadUtils.assertMainThread();
    potentiallyCostly();

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable code in assertedBad.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is unreachable code in assertedBad due to condition being false.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is effectively unreachable
  }
}