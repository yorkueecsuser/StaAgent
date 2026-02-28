class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() does not return true
        System.out.println("Unreachable code");
        break;
    }
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() does not return true
        System.out.println("Unreachable code");
        break;
    }
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
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() does not return true
        System.out.println("Unreachable code");
        break;
    }
  }

  synchronized void lockThis() {}

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the switch statement unreachable
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() does not return true
        System.out.println("Unreachable code");
        break;
    }
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the switch statement unreachable
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
    }
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() does not return true
        System.out.println("Unreachable code");
        break;
    }
  }

  synchronized void lockThis(Interproc d) {}

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the switch statement unreachable
  }
}