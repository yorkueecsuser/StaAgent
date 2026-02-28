import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
      out.printf("This is unreachable %d", 123);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}