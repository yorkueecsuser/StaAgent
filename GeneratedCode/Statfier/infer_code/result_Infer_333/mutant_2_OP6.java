import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}