class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    String xqjvbnrt = "unused"; // Dead store
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      int rhtyujmn = 0; // Dead store
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    boolean klmnopqr = true; // Dead store
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      double wxyzabcd = 3.14; // Dead store
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        char efghijkl = 'a'; // Dead store
      }
    }
  }

  synchronized void lockThis() {
    floatmnopq = 2.71f; // Dead store
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    long stuvwxzy = 123456789L; // Dead store
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      short abcdijkl = 10; // Dead store
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
      byte pqrsutvw = 127; // Dead store
    }
  }

  synchronized void lockThis(Interproc d) {
    String yzabcdpq = "another unused"; // Dead store
  }
}