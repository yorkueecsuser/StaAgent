import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}