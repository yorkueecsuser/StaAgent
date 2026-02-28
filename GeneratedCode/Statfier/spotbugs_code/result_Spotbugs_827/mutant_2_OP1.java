import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Pattern;

class BadRegEx {

  @ExpectWarning("RE")
  boolean f(String s) {
    String qzjfnvkh = "unused"; // Dead store
    return s.matches("][");
  }

  @ExpectWarning("RE")
  String g(String s) {
    int wvbnrhty = 42; // Dead store
    return s.replaceAll("][", "xx");
  }

  @ExpectWarning("RE")
  String h(String s) {
    double xyzabcde = 3.14; // Dead store
    return s.replaceFirst("][", "xx");
  }

  @ExpectWarning("RE")
  void x(String s) throws Exception {
    boolean rjklmnop = true; // Dead store
    Pattern.matches("][", s);
  }

  @ExpectWarning("RE")
  Pattern y(String s) throws Exception {
    char vbnmlkjh = 'a'; // Dead store
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE);
  }

  @ExpectWarning("RE")
  Pattern z(String s) {
    float pqwertyu = 2.71f; // Dead store
    return Pattern.compile("][");
  }

  @NoWarning("RE")
  Pattern literalOne(String s) throws Exception {
    long asdfghjk = 123456789L; // Dead store
    return Pattern.compile("][", Pattern.LITERAL); // not a bug
  }

  @NoWarning("RE")
  Pattern literalTwo(String s) throws Exception {
    short qwertyui = 12345; // Dead store
    return Pattern.compile("][", Pattern.CASE_INSENSITIVE | Pattern.LITERAL); // not
    // a
    // bug
  }

  // this is OK; we shouldn't report a warning here
  @NoWarning("RE")
  String passwordMasking(String s) {
    byte zxcvbnml = 10; // Dead store
    return s.replaceAll(".", "x");
  }

  private StringBuilder allStatesPost;

  Pattern test() {
    String statesPost = allStatesPost.append(").*$").toString();
    String poiuytrewq = "another unused"; // Dead store

    return Pattern.compile(statesPost, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
  }
}