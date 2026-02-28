import java.util.regex.Pattern;

class Ideas_2010_07_01 {

  public static void main(String args[]) {
    Pattern.compile("+");
    Pattern.compile("+", Pattern.CANON_EQ);
    Pattern.compile("+", Pattern.CASE_INSENSITIVE);
    Pattern.compile("+", Pattern.COMMENTS);
    Pattern.compile("+", Pattern.DOTALL);
    Pattern.compile("+", Pattern.LITERAL); // Not an error
    Pattern.compile("+", Pattern.MULTILINE);
    Pattern.compile("+", Pattern.UNICODE_CASE);
    Pattern.compile("+", Pattern.UNIX_LINES);
    Pattern.compile("+", Pattern.UNICODE_CASE | Pattern.UNIX_LINES);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This is an unreachable branch.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}