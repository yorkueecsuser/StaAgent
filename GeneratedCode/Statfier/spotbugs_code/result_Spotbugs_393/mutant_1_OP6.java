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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
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

    // Unreachable for loop mutant
    boolean conditionForMain = getCondition();
    for (int i = 0; conditionForMain; i++) {
      // This loop is unreachable because conditionForMain will always be false
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

    // Unreachable for loop mutant
    boolean conditionForMyMethod = getCondition();
    for (int i = 0; conditionForMyMethod; i++) {
      // This loop is unreachable because conditionForMyMethod will always be false
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

    // Unreachable for loop mutant
    boolean conditionForMyProg = getCondition();
    for (int i = 0; conditionForMyProg; i++) {
      // This loop is unreachable because conditionForMyProg will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return Math.random() < 0; // This will always be false
  }
}