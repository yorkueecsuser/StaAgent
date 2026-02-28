import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.util.regex.Pattern;

class RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION {

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug1(String any1, String any2) {
    any1.replaceAll(File.separator, any2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1, String any2) {
    any1.replaceFirst(File.separator, any2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug(String any1) {
    any1.split(File.separator);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2(String any1) {
    any1.matches(File.separator);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug2() {
    Pattern.compile(File.separator);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug3() {
    Pattern.compile(File.separator, Pattern.CASE_INSENSITIVE);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug() {
    Pattern.compile(File.separator, Pattern.LITERAL);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @ExpectWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void bug4() {
    Pattern.compile(File.separator, Pattern.DOTALL);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug2() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.CASE_INSENSITIVE);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  @NoWarning("RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION")
  void notBug3() {
    Pattern.compile(File.separator, Pattern.LITERAL | Pattern.DOTALL);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}