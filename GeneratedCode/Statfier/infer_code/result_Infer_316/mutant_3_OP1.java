class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    String qvbnrhty = "unusedVariable"; // Dead Store
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      int xhjvfrty = 42; // Dead Store
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    boolean klmnopqr = true; // Dead Store
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      double wxyzabcd = 3.14; // Dead Store
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        char rstuvwxy = 'a'; // Dead Store
      }
    }
  }

  synchronized void lockThis() {}
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    float pqrsabcd = 2.71f; // Dead Store
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      long mnopqrst = 100L; // Dead Store
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
      short ghijklmn = 10; // Dead Store
    }
  }

  synchronized void lockThis(Interproc d) {}
}