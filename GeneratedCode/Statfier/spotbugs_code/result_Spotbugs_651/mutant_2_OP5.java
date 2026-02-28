import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceAll(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceFirst(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceAll("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceFirst("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to ensure the switch is unreachable
        break;
    }
    return any.indexOf("|");
  }

  private boolean getCondition() {
    return false;
  }
}