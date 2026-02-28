import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %s", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  void stringInsteadOfInteger(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  void wrongNumberOfArguments(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d, World %s", 10, "string", 1.5);
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("%d %s%n", field, field.toString());
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  void stringConcat(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("%s" + "%s", "hello", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf(format, "hello", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code remains unchanged
      out.printf("Hello %d", "world");
    } else {
      // Unreachable if-else branch
      out.printf("This is unreachable %s", "branch");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}