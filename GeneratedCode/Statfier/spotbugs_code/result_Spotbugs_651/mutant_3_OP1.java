import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    String unusedVar1 = "abcdefgh"; // Dead store
    return any.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    int unusedVar2 = 12345678; // Dead store
    return any.replaceAll(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    boolean unusedVar3 = true; // Dead store
    return any.replaceFirst(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    char unusedVar4 = 'a'; // Dead store
    return any.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    double unusedVar5 = 987654321.0; // Dead store
    return any.replaceAll("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    long unusedVar6 = 9876543210L; // Dead store
    return any.replaceFirst("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    float unusedVar7 = 123.456f; // Dead store
    return any.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    byte unusedVar8 = 127; // Dead store
    return any.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    short unusedVar9 = 32767; // Dead store
    return any.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    String unusedVar10 = "zyxwvuts"; // Dead store
    return any.indexOf("|");
  }
}