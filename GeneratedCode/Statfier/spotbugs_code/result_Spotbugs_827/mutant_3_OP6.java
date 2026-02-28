import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Pattern;

class BadRegEx {

  @ExpectWarning("RE")
  boolean f(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return s.matches("][");
  }

  @ExpectWarning("RE")
  String g(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return s.replaceAll("][", "xx");
  }

  @ExpectWarning("RE")
  String h(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return s.replaceFirst("][", "xx");
  }

  @ExpectWarning("RE")
  void x(String s) throws Exception {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    Pattern.matches("][", s);
  }

  @ExpectWarning("RE")
  Pattern y(String s) throws Exception {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE);
  }

  @ExpectWarning("RE")
  Pattern z(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Pattern.compile("][");
  }

  @NoWarning("RE")
  Pattern literalOne(String s) throws Exception {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Pattern.compile("][", Pattern.LITERAL); // not a bug
  }

  @NoWarning("RE")
  Pattern literalTwo(String s) throws Exception {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE | Pattern.LITERAL); // not a bug
  }

  // this is OK; we shouldn't report a warning here
  @NoWarning("RE")
  String passwordMasking(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return s.replaceAll(".", "x");
  }

  private StringBuilder allStatesPost;

  Pattern test() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    String statesPost = allStatesPost.append(").*$").toString();

    return Pattern.compile(statesPost, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
  }

  private boolean getCondition() {
    return false;
  }
}