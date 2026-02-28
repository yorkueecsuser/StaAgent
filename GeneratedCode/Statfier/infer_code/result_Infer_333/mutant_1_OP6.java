import codetoanalyze.java.InferBuiltins;

class Builtins {

  void blockErrorOk() {
    Object x = null;
    InferBuiltins.assume(x!= null);
    x.toString();
    // Mutant: Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void doNotBlockErrorBad(Object x) {
    Object y = null;
    InferBuiltins.assume(x!= null);
    y.toString();
    // Mutant: Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void blockErrorIntAssumeOk(Object x) {
    Object y = null;
    int i = 0;
    InferBuiltins.assume(i!= 0);
    y.toString();
    // Mutant: Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  void causeErrorBad(Object x) {
    InferBuiltins.assume(x == null);
    x.toString();
    // Mutant: Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}