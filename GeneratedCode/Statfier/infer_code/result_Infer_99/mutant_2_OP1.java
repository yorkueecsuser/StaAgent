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
    double pqrstuvw = 3.14;
  }

  @SuppressLint("OTHER_CHECKER")
  void notSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    boolean xyzabcde = true;
  }

  void stringInsteadOfInteger(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    char fghijklm = 'a';
  }

  void wrongNumberOfArguments(PrintStream out) {
    out.printf("Hello %d, World %s", 10, "string", 1.5);
    // Dead Store Mutation
    long nopqrstu = 123456789L;
  }

  Integer field;

  void fieldAccess(PrintStream out) {
    out.printf("%d %s%n", field, field.toString());
    // Dead Store Mutation
    float vwxyzabc = 2.718f;
  }

  void stringConcat(PrintStream out) {
    out.printf("%s" + "%s", "hello", "world");
    // Dead Store Mutation
    short defghijk = 100;
  }

  void formatStringIsNotLiteral(PrintStream out) {
    String format = "%s %s";
    out.printf(format, "hello", "world");
    // Dead Store Mutation
    byte lmnopqrs = 127;
  }
}

@SuppressLint("checkers-printf-args")
class SuppressedPrintfArgsChecker {

  void classSuppressed(PrintStream out) {
    out.printf("Hello %d", "world");
    // Dead Store Mutation
    int tuvwxyza = 99;
  }
}