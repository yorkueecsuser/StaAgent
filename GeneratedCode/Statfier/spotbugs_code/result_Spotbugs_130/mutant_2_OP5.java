import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    return true;
  }

  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure switch is not empty and reachable
        System.out.println("Default case executed");
        break;
    }
  }
}