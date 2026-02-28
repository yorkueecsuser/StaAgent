class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    lockParamA(a); // Duplicate statement
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
    synchronized (b) { // Duplicate statement
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    lockParamB(a); // Duplicate statement
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
    }
    synchronized (b) { // Duplicate statement
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        lockThis(); // Duplicate statement
      }
    }
  }

  synchronized void lockThis() {}
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    lockParam(c); // Duplicate statement
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
    synchronized (d) { // Duplicate statement
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
      lockThis(c); // Duplicate statement
    }
  }

  synchronized void lockThis(Interproc d) {}
}