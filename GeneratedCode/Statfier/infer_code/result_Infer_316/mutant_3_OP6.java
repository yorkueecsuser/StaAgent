class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (b) {
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (this) {
      synchronized (b) {
        lockThis();
      }
    }
  }

  synchronized void lockThis() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    lockParam(c);
  }

  void lockParam(Interproc d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (d) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (c) {
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}