import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3000680 {

  /** Case1: FB doesn't report Infinite Loop in 'private''static' methods */
  @ExpectWarning("IL")
  private static void case1() {
    case1();
    // Mutant: Adding an unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      System.out.println("This is unreachable code.");
    }
  }

  /** Case1: FB doesn't report Infinite Loop in 'private''static' methods */
  @ExpectWarning("IL")
  static void case1a() {
    case1a();
    // Mutant: Adding an unreachable if statement
    boolean condition1a = getCondition();
    if (condition1a) {
      System.out.println("This is unreachable code in case1a.");
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
    // Mutant: Adding an unreachable if statement
    boolean condition2 = getCondition();
    if (condition2) {
      System.out.println("This is unreachable code in case2.");
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
    // Mutant: Adding an unreachable if statement
    boolean condition2a = getCondition();
    if (condition2a) {
      System.out.println("This is unreachable code in case2a.");
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
    // Mutant: Adding an unreachable if statement
    boolean condition2b = getCondition();
    if (condition2b) {
      System.out.println("This is unreachable code in case2b.");
    }
  }

  public void case2c(boolean b) {
    System.out.println("Hello world!");

    if (b) {
      case2c(b);
    } else {
      case2c(b);
    }
    // Mutant: Adding an unreachable if statement
    boolean condition2c = getCondition();
    if (condition2c) {
      System.out.println("This is unreachable code in case2c.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}