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

    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
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

    // Dead Store Mutation
    int xqjvbnrhty = 42;
  }

  Object globalError;

  Object getGlobalError() {
    return globalError;
  }

  void myMethod() {
    // some code

    if (Math.random() > 0.5) globalError = "x";

    // some code

    // Dead Store Mutation
    double zvbnrhty = 3.14;
  }

  @NoWarning("RCN")
  void myProg() {
    globalError = null;
    myMethod();

    // FindBugs considers this check redundant
    if (globalError!= null) {
      // do something

    }

    // Dead Store Mutation
    boolean fvbnrhty = true;
  }
}