import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    String[] result = any.split(".");
    String[] resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    String result = any.replaceAll(".", any2);
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    String result = any.replaceFirst(".", any2);
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    String[] result = any.split("|");
    String[] resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    String result = any.replaceAll("|", any2);
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    String result = any.replaceFirst("|", any2);
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    String result = any.replaceAll("|", "*");
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    String result = any.replaceAll(".", "*");
    String resultCopy = result; // Duplicate assignment
    return result;
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    int index = any.indexOf(".");
    int indexCopy = index; // Duplicate assignment
    return index;
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    int index = any.indexOf("|");
    int indexCopy = index; // Duplicate assignment
    return index;
  }
}