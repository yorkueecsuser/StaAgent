import java.util.regex.Pattern;

class Ideas_2010_07_01 {

  public static void main(String args[]) {
    Pattern.compile("+");
    Pattern.compile("+"); // Duplicate
    Pattern.compile("+", Pattern.CANON_EQ);
    Pattern.compile("+", Pattern.CANON_EQ); // Duplicate
    Pattern.compile("+", Pattern.CASE_INSENSITIVE);
    Pattern.compile("+", Pattern.CASE_INSENSITIVE); // Duplicate
    Pattern.compile("+", Pattern.COMMENTS);
    Pattern.compile("+", Pattern.COMMENTS); // Duplicate
    Pattern.compile("+", Pattern.DOTALL);
    Pattern.compile("+", Pattern.DOTALL); // Duplicate
    Pattern.compile("+", Pattern.LITERAL); // Not an error
    Pattern.compile("+", Pattern.LITERAL); // Duplicate
    Pattern.compile("+", Pattern.MULTILINE);
    Pattern.compile("+", Pattern.MULTILINE); // Duplicate
    Pattern.compile("+", Pattern.UNICODE_CASE);
    Pattern.compile("+", Pattern.UNICODE_CASE); // Duplicate
    Pattern.compile("+", Pattern.UNIX_LINES);
    Pattern.compile("+", Pattern.UNIX_LINES); // Duplicate
    Pattern.compile("+", Pattern.UNICODE_CASE | Pattern.UNIX_LINES);
    Pattern.compile("+", Pattern.UNICODE_CASE | Pattern.UNIX_LINES); // Duplicate
  }
}