import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant: Duplicate of the original statement
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant: Duplicate of the original statement
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant: Duplicate of the original statement
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant: Duplicate of the original statement
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    out.printf("Hello %d, World %s", 10, "string", 1.5); // Mutant: Duplicate of the original statement
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    out.printf("%s" + "%s", "hello", "world"); // Mutant: Duplicate of the original statement
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    out.printf(format, "hello", "world"); // Mutant: Duplicate of the original statement
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    out.printf("Hello %d", "world"); // Mutant: Duplicate of the original statement
  }
}