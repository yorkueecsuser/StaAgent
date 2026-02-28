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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}