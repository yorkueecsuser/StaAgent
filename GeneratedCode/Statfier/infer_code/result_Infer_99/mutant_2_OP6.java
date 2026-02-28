import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}