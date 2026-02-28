import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Pattern;

class BadRegEx {

  @ExpectWarning("RE")
  boolean f(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return s.matches("][");
  }

  @ExpectWarning("RE")
  String g(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return s.replaceAll("][", "xx");
  }

  @ExpectWarning("RE")
  String h(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return s.replaceFirst("][", "xx");
  }

  @ExpectWarning("RE")
  void x(String s) throws Exception {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    Pattern.matches("][", s);
  }

  @ExpectWarning("RE")
  Pattern y(String s) throws Exception {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE);
  }

  @ExpectWarning("RE")
  Pattern z(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Pattern.compile("][");
  }

  @NoWarning("RE")
  Pattern literalOne(String s) throws Exception {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Pattern.compile("][", Pattern.LITERAL); // not a bug
  }

  @NoWarning("RE")
  Pattern literalTwo(String s) throws Exception {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE | Pattern.LITERAL); // not
    // a
    // bug
  }

  // this is OK; we shouldn't report a warning here
  @NoWarning("RE")
  String passwordMasking(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return s.replaceAll(".", "x");
  }

  private StringBuilder allStatesPost;

  Pattern test() {
    String statesPost = allStatesPost.append(").*$").toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return Pattern.compile(statesPost, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}