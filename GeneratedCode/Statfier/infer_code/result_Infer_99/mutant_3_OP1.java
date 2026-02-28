import android.annotation.SuppressLint;
import java.io.PrintStream;

class PrintfArgsChecker {

  void argumentsMatch(PrintStream out) {
    out.printf("Hello %s", "world");
    // Dead Store Mutation
    String abcdefgh = "unused";
  }

  @SuppressLint("CHECKERS_PRINTF_ARGS")
  void suppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    int hijklmno = 42;
  }

  @SuppressLint("checkers-printf-args")
  void normalizedSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    boolean pqrstuvw = true;
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    char xyzabcde = 'x';
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    float fghijklm = 3.14f;
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    // Dead Store Mutation
    double nopqrstu = 2.718;
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
    // Dead Store Mutation
    long vwxyzabc = 987654321L;
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    // Dead Store Mutation
    short defghijk = 123;
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    // Dead Store Mutation
    byte lmnopqrs = 42;
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    String tuvwxyzA = "another unused";
  }
}