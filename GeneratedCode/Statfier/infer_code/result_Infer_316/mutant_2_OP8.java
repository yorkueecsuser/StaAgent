class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB x) {
    lockParamB(x);
  }

  void lockParamB(InterprocB y) {
    synchronized (y) {
    }
  }

  void lockThisTwiceOk(InterprocB z) {
    synchronized (this) {
      synchronized (z) {
        lockThis();
      }
    }
  }

  synchronized void lockThis() {}
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc e) {
    synchronized (e) {
      lockThis(e);
    }
  }

  synchronized void lockThis(Interproc f) {}
}