import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Pattern;

class BadRegEx {

  @ExpectWarning("RE")
  boolean f(String s) {
    return s.matches("][");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("RE")
  String g(String s) {
    return s.replaceAll("][", "xx");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("RE")
  String h(String s) {
    return s.replaceFirst("][", "xx");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("RE")
  void x(String s) throws Exception {
    Pattern.matches("][", s);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("RE")
  Pattern y(String s) throws Exception {
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("RE")
  Pattern z(String s) {
    return Pattern.compile("][");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("RE")
  Pattern literalOne(String s) throws Exception {
    return Pattern.compile("][", Pattern.LITERAL); // not a bug
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("RE")
  Pattern literalTwo(String s) throws Exception {
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE | Pattern.LITERAL); // not a bug
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // this is OK; we shouldn't report a warning here
  @NoWarning("RE")
  String passwordMasking(String s) {
    return s.replaceAll(".", "x");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  private StringBuilder allStatesPost;

  Pattern test() {
    String statesPost = allStatesPost.append(").*$").toString();
    return Pattern.compile(statesPost, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}