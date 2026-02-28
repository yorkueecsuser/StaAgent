class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
      }
    }
  }

  synchronized void lockThis() {}

  // Mutated code
  synchronized void lockThisThenParamBad(InterprocA x) {
    lockParamA(x);
  }

  void lockParamA(InterprocA y) {
    synchronized (y) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB z) {
    lockParamB(z);
  }

  void lockParamB(InterprocB w) {
    synchronized (w) {
    }
  }

  void lockThisTwiceOk(InterprocB v) {
    synchronized (this) {
      synchronized (v) {
        lockThis();
      }
    }
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
  }

  // Mutated code
  synchronized void lockThisThenParamBad(Interproc e) {
    lockParam(e);
  }

  void lockParam(Interproc f) {
    synchronized (f) {
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {}

  // Mutated code
  void lockParamThenThisOk(Interproc g) {
    synchronized (g) {
      lockThis(g);
    }
  }

  synchronized void lockThis(Interproc h) {}
}