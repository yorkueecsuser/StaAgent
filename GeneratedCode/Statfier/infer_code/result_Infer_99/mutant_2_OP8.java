import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
  }

  // Mutated code
  void argumentsMatch(PrintStream a) {
    a.printf("Hello %s", "world");
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream b) {
    b.printf("Hello %d", "world");
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream c) {
    c.printf("Hello %d", "world");
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream d) {
    d.printf("Hello %d", "world");
  }

  void stringInsteadOfInteger(PrintStream e) {
    e.printf("Hello %d", "world");
  }

  void wrongNumberOfArguments(PrintStream f) {
    f.printf("Hello %d, World %s", 10, "string", 1.5);
  }

  Integer g;

  void fieldAccess(PrintStream h) {
    h.printf("%d %s%n", g, g.toString());
  }

  void stringConcat(PrintStream i) {
    i.printf("%s" + "%s", "hello", "world");
  }

  void formatStringIsNotLiteral(PrintStream j) {
    String k = "%s %s";
    j.printf(k, "hello", "world");
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
  }

  // Mutated code
  void classSuppressed(PrintStream l) {
    l.printf("Hello %d", "world");
  }
}