class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in lockThisThenParamBad");
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in lockParamA");
      }
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in lockThisThenParamOk");
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in lockParamB");
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable statement in lockThisTwiceOk");
        }
      }
    }
  }

  synchronized void lockThis() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in lockThis");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in lockThisThenParamBad of InterprocA");
    }
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in lockParam of InterprocA");
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
      lockThis(c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in lockParamThenThisOk of InterprocB");
      }
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in lockThis of InterprocB");
    }
  }

  private boolean getCondition() {
    return false;
  }
}