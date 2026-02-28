import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3000680 {

  /** Case1: FB doesn't report Infinite Loop in 'private''static' methods */
  @ExpectWarning("IL")
  private static void case1() {
    case1();
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable while loop
    }
  }

  /** Case1: FB doesn't report Infinite Loop in 'private''static' methods */
  @ExpectWarning("IL")
  static void case1a() {
    case1a();
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Another unreachable while loop
    }
  }

  /** Case2: 'if' condition causes FB ignores Infinite loop check */
  @ExpectWarning("IL")
  public void case2() {
    // this naive condition causes infinite loop doesn't report
    if (true) {
      System.out.println("Hello world!");
    }

    String text = null;
    if (text!= null) {
      case2();
    } else {
      case2();
    }
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Yet another unreachable while loop
    }
  }

  @ExpectWarning("IL")
  public void case2a() {

    String text = null;
    if (text!= null) {
      case2a();
    } else {
      case2a();
    }
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // More unreachable while loop
    }
  }

  public void case2b() {
    System.out.println("Hello world!");

    String text = null;
    if (text!= null) {
      case2b();
    } else {
      case2b();
    }
    boolean conditionWhile5 = getCondition();
    while (conditionWhile5) {
      // Additional unreachable while loop
    }
  }

  public void case2c(boolean b) {
    System.out.println("Hello world!");

    if (b) {
      case2c(b);
    } else {
      case2c(b);
    }
    boolean conditionWhile6 = getCondition();
    while (conditionWhile6) {
      // Further unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}