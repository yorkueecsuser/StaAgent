import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.util.regex.Pattern;

class RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION {

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1(String any1, String any2) {
    any1.replaceAll(File.separator, any2);
    String qzjxwvut = "unusedVariable";
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1, String any2) {
    any1.replaceFirst(File.separator, any2);
    int rmnpolkj = 42;
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug(String any1) {
    any1.split(File.separator);
    boolean abcdefgh = true;
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1) {
    any1.matches(File.separator);
    double ijklmnop = 3.14;
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2() {
    Pattern.compile(File.separator);
    char qrstuvwx = 'a';
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
    float yzabcd = 2.71f;
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug() {
    Pattern.compile(File.separator, Pattern.LITERAL);
    long efghijkl = 100L;
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4() {
    Pattern.compile(File.separator, Pattern.DOTALL);
    short mnopqrst = 10;
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
    byte uvwxyzab = 5;
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
    String cdefghij = "anotherUnused";
  }
}