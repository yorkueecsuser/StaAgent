import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class RE_POSSIBLE_UNINTENDED_PATTERN {

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug1(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug1");
    }
    return any.split(".");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug2(String any, String any2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug2");
    }
    return any.replaceAll(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug3(String any, String any2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug3");
    }
    return any.replaceFirst(".", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String[] bug11(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug11");
    }
    return any.split("|");
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug22(String any, String any2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug22");
    }
    return any.replaceAll("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug33(String any, String any2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug33");
    }
    return any.replaceFirst("|", any2);
  }

  @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String bug4(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in bug4");
    }
    return any.replaceAll("|", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  String notBug1(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in notBug1");
    }
    return any.replaceAll(".", "*");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug2(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in notBug2");
    }
    return any.indexOf(".");
  }

  @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
  @ExpectWarning("IIO_INEFFICIENT_INDEX_OF")
  int notBug22(String any) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in notBug22");
    }
    return any.indexOf("|");
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}