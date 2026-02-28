import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.util.regex.Pattern;

class RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION {

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1(String any1, String any2) {
    any1.replaceAll(File.separator, any2);
    String qvbnrhty = "unusedVariable"; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1, String any2) {
    any1.replaceFirst(File.separator, any2);
    int mnbvcxza = 42; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug(String any1) {
    any1.split(File.separator);
    boolean lkjhgfds = true; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1) {
    any1.matches(File.separator);
    char poiuytrew = 'a'; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2() {
    Pattern.compile(File.separator);
    double zxcvbnml = 3.14; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
    long asdfghjk = 123456789L; // Dead Store
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug() {
    Pattern.compile(File.separator, Pattern.LITERAL);
    float qwertyui = 2.718f; // Dead Store
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4() {
    Pattern.compile(File.separator, Pattern.DOTALL);
    short yuiopasd = 100; // Dead Store
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
    byte hgfdsa = 127; // Dead Store
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
    String trewqpoi = "anotherUnusedVariable"; // Dead Store
  }
}