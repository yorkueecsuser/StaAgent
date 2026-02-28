class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    lockParamA(a); // Duplicate method call
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    lockParamB(a); // Duplicate method call
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        lockThis(); // Duplicate method call
      }
    }
  }

  synchronized void lockThis() {}
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    lockParam(c); // Duplicate method call
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
      lockThis(c); // Duplicate method call
    }
  }

  synchronized void lockThis(Interproc d) {}
}