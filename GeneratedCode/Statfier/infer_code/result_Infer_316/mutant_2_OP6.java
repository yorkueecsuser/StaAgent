class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and expected to be false
      }
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and expected to be false
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          // This loop is unreachable because conditionFor is dynamically determined and expected to be false
        }
      }
    }
  }

  synchronized void lockThis() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the loop unreachable
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and expected to be false
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the loop unreachable
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and expected to be false
      }
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the loop unreachable
  }
}