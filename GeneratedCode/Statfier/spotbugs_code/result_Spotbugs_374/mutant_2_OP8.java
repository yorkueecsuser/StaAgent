import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.util.regex.Pattern;

class RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION {

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1(String any1, String any2) {
    any1.replaceAll(File.separator, any2);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1, String any2) {
    any1.replaceFirst(File.separator, any2);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug(String any1) {
    any1.split(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1) {
    any1.matches(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2() {
    Pattern.compile(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug() {
    Pattern.compile(File.separator, Pattern.LITERAL);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4() {
    Pattern.compile(File.separator, Pattern.DOTALL);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
  }

  // Mutated methods
  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1a(String b, String c) {
    b.replaceAll(File.separator, c);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2a(String d, String e) {
    d.replaceFirst(File.separator, e);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void buga(String f) {
    f.split(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2a(String g) {
    g.matches(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2b() {
    Pattern.compile(File.separator);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3a() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBuga() {
    Pattern.compile(File.separator, Pattern.LITERAL);
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4a() {
    Pattern.compile(File.separator, Pattern.DOTALL);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2a() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3a() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
  }
}