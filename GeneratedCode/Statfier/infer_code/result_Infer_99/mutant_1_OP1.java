import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
    // Dead Store Mutation
    String abcdabcd = "unused";
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    int efghijkl = 42;
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    boolean mnopqrst = true;
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    double uvwxyzab = 3.14;
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    char cdefghij = 'x';
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    // Dead Store Mutation
    float klmnopqr = 2.71f;
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
    // Dead Store Mutation
    long stuvwxyz = 987654321L;
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    // Dead Store Mutation
    short abcdefgh = 123;
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    // Dead Store Mutation
    byte ijklmnop = 45;
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    int opqrstuv = 89;
  }
}