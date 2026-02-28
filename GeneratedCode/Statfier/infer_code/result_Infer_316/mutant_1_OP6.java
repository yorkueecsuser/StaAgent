class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
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
    synchronized (b) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      synchronized (b) {
        lockThis();
        boolean conditionForInner = getCondition();
        for (int i = 0; conditionForInner; i++) {
          // Unreachable loop
        }
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
    synchronized (d) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
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