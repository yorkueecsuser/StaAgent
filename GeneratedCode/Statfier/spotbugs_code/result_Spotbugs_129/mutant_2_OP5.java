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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}