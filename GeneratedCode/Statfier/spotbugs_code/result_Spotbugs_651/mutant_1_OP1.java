import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    String qwejfnvb = "unusedVariable"; // Dead store
    return any.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    int klmnopqr = 42; // Dead store
    return any.replaceAll(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    double rstuvwxy = 3.14; // Dead store
    return any.replaceFirst(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    boolean abcdwxyz = true; // Dead store
    return any.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    char yzabcdwx = 'x'; // Dead store
    return any.replaceAll("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    float vwxyzabc = 2.71f; // Dead store
    return any.replaceFirst("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    long pqrstuvw = 100L; // Dead store
    return any.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    short hijklmno = 10; // Dead store
    return any.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    byte efghijkl = 5; // Dead store
    return any.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    Stringmnopqr = "anotherUnused"; // Dead store
    return any.indexOf("|");
  }
}