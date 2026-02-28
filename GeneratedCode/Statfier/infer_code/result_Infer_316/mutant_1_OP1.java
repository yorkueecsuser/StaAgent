class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    String hgfjkdsl = "deadstore"; // Dead Store Mutation
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      int qwerasdf = 42; // Dead Store Mutation
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    boolean zxcvbnml = true; // Dead Store Mutation
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      double poiuytrew = 3.14; // Dead Store Mutation
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        char lkjhgfdsa = 'x'; // Dead Store Mutation
      }
    }
  }

  synchronized void lockThis() {
    float mnbvcxz = 2.71f; // Dead Store Mutation
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    long asdfghjkl = 123456789L; // Dead Store Mutation
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      short poiuyt = 10; // Dead Store Mutation
    }
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
      byte cvbnm = 127; // Dead Store Mutation
    }
  }

  synchronized void lockThis(Interproc d) {
    String qwertyui = "anotherdeadstore"; // Dead Store Mutation
  }
}