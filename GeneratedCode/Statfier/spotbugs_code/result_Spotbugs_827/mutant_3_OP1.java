import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Pattern;

class BadRegEx {

  @ExpectWarning("RE")
  boolean f(String s) {
    String unusedVar1 = "abcdefgh"; // Dead store
    return s.matches("][");
  }

  @ExpectWarning("RE")
  String g(String s) {
    int unusedVar2 = 12345678; // Dead store
    return s.replaceAll("][", "xx");
  }

  @ExpectWarning("RE")
  String h(String s) {
    double unusedVar3 = 98765432.1; // Dead store
    return s.replaceFirst("][", "xx");
  }

  @ExpectWarning("RE")
  void x(String s) throws Exception {
    boolean unusedVar4 = true; // Dead store
    Pattern.matches("][", s);
  }

  @ExpectWarning("RE")
  Pattern y(String s) throws Exception {
    char unusedVar5 = 'a'; // Dead store
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE);
  }

  @ExpectWarning("RE")
  Pattern z(String s) {
    long unusedVar6 = 8765432109L; // Dead store
    return Pattern.compile("][");
  }

  @NoWarning("RE")
  Pattern literalOne(String s) throws Exception {
    float unusedVar7 = 123.456f; // Dead store
    return Pattern.compile("][", Pattern.LITERAL); // not a bug
  }

  @NoWarning("RE")
  Pattern literalTwo(String s) throws Exception {
    short unusedVar8 = 1234; // Dead store
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE | Pattern.LITERAL); // not
    // a
    // bug
  }

  // this is OK; we shouldn't report a warning here
  @NoWarning("RE")
  String passwordMasking(String s) {
    byte unusedVar9 = 100; // Dead store
    return s.replaceAll(".", "x");
  }

  private StringBuilder allStatesPost;

  Pattern test() {
    String statesPost = allStatesPost.append(").*$").toString();
    String unusedVar10 = "xyzuvwxy"; // Dead store

    return Pattern.compile(statesPost, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
  }
}