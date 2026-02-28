import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    out.printf("Hello %d, World %s", 10, "string", 1.5); // Mutant
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    out.printf("%s" + "%s", "hello", "world"); // Mutant
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    String format2 = "%s %s"; // Unique mutant
    out.printf(format2, "hello", "world"); // Mutant
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant
  }
}