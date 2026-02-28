import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %s", "world");
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d", "world");
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d", "world");
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d", "world");
  }

  void stringInsteadOfInteger(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d", "world");
  }

  void wrongNumberOfArguments(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d, World %s", 10, "string", 1.5);
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("%d %s%n", field, field.toString());
  }

  void stringConcat(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("%s" + "%s", "hello", "world");
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf(format, "hello", "world");
  }

  private boolean getCondition() {
    return false;
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      out.println("This is unreachable");
    }
    out.printf("Hello %d", "world");
  }

  private boolean getCondition() {
    return false;
  }
}