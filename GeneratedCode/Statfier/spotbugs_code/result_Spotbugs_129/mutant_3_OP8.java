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

    // Mutated code
    Pattern.compile("+", Pattern.CANON_EQ | Pattern.CASE_INSENSITIVE);
    Pattern.compile("+", Pattern.COMMENTS | Pattern.DOTALL);
    Pattern.compile("+", Pattern.LITERAL | Pattern.MULTILINE);
    Pattern.compile("+", Pattern.UNICODE_CASE | Pattern.UNIX_LINES);
    Pattern.compile("+", Pattern.CANON_EQ | Pattern.COMMENTS);
    Pattern.compile("+", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Pattern.compile("+", Pattern.LITERAL | Pattern.UNICODE_CASE);
    Pattern.compile("+", Pattern.MULTILINE | Pattern.UNIX_LINES);
    Pattern.compile("+", Pattern.CANON_EQ | Pattern.LITERAL);
    Pattern.compile("+", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
  }
}