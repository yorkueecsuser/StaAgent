import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.util.regex.Pattern;

class RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION {

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1(String any1, String any2) {
    any1.replaceAll(File.separator, any2);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1, String any2) {
    any1.replaceFirst(File.separator, any2);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug(String any1) {
    any1.split(File.separator);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable if statement.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1) {
    any1.matches(File.separator);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("More unreachable if statement.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2() {
    Pattern.compile(File.separator);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Even more unreachable if statement.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("And another unreachable if statement.");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug() {
    Pattern.compile(File.separator, Pattern.LITERAL);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in notBug.");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4() {
    Pattern.compile(File.separator, Pattern.DOTALL);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in bug4.");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in notBug2.");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in notBug3.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}