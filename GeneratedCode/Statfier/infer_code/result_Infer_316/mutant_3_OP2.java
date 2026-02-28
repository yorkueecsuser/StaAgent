class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    lockParamA(a); // Duplicate call to maintain the original logic
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    lockParamB(a); // Duplicate call to maintain the original logic
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        lockThis(); // Duplicate call to maintain the original logic
      }
    }
  }

  synchronized void lockThis() {}
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    lockParam(c); // Duplicate call to maintain the original logic
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
      lockThis(c); // Duplicate call to maintain the original logic
    }
  }

  synchronized void lockThis(Interproc d) {}
}