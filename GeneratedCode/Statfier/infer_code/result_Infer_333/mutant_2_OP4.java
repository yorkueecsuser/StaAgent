import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable code.");
    }
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable code.");
    }
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable code.");
    }
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable code.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}