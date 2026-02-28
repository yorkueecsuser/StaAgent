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

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed.");
    } else {
      System.out.println("This will also never be printed.");
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

    // Inserted unreachable if-else statement
    boolean shouldRunMain = getCondition();
    if (shouldRunMain) {
      System.out.println("This will never be printed in main.");
    } else {
      System.out.println("This will also never be printed in main.");
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

    // Inserted unreachable if-else statement
    boolean shouldRunMyMethod = getCondition();
    if (shouldRunMyMethod) {
      System.out.println("This will never be printed in myMethod.");
    } else {
      System.out.println("This will also never be printed in myMethod.");
    }
  }

  @NoWarning("RCN")
  void myProg() {
    globalError = null;
    myMethod();

    // FindBugs considers this check redundant
    if (globalError!= null) {
      // do something

    }

    // Inserted unreachable if-else statement
    boolean shouldRunMyProg = getCondition();
    if (shouldRunMyProg) {
      System.out.println("This will never be printed in myProg.");
    } else {
      System.out.println("This will also never be printed in myProg.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}