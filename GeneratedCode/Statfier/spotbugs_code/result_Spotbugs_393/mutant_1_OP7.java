import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3553542 {

  @DesireNoWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE")
  public static void checkIfNullIsReturned(GoodBehavingClass goodBehavingClass) {
    String isNullReturned;

    isNullReturned = goodBehavingClass.isNullReturned();

    if (isNullReturned!= null) {
      System.out.println("No it isn't. It has length " + isNullReturned.length());
    } else {
      System.out.println("Yes it is.");
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop will never execute.");
    }
  }

  static class GoodBehavingClass {
    public String isNullReturned() {
      return "noop";
    }
  }

  // Assume this is class is defined in some the third party implementation
  // using this FalsePositive as library code.
  static class BadBehavingClass /* extends GoodBehavingClass */ {

    public String isNullReturned() {
      return null;
    }
  }

  public static void main(String[] args) {
    checkIfNullIsReturned(new GoodBehavingClass());
    // Assume this is called in the third party implementation using this
    // FalsePositive as library code.
    //        checkIfNullIsReturned(new BadBehavingClass());

    // Introduced unreachable while loop
    boolean conditionWhileMain = getCondition();
    while (conditionWhileMain) {
      // Unreachable code
      System.out.println("This loop will never execute in main.");
    }
  }

  Object globalError;

  Object getGlobalError() {
    return globalError;
  }

  void myMethod() {
    // some code

    if (Math.random() > 0.5) globalError = "x";

    // some code

    // Introduced unreachable while loop
    boolean conditionWhileMyMethod = getCondition();
    while (conditionWhileMyMethod) {
      // Unreachable code
      System.out.println("This loop will never execute in myMethod.");
    }
  }

  @NoWarning("RCN")
  void myProg() {
    globalError = null;
    myMethod();

    // FindBugs considers this check resundant
    if (globalError!= null) {
      // do something

    }

    // Introduced unreachable while loop
    boolean conditionWhileMyProg = getCondition();
    while (conditionWhileMyProg) {
      // Unreachable code
      System.out.println("This loop will never execute in myProg.");
    }
  }

  // Method to provide a dynamic condition for the while loops
  private static boolean getCondition() {
    return false;
  }
}