class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    lockParamA(a);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThisThenParamBad");
        break;
    }
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockParamA");
        break;
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    lockParamB(a);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThisThenParamOk");
        break;
    }
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockParamB");
        break;
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        lockThis();
      }
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThisTwiceOk");
        break;
    }
  }

  synchronized void lockThis() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThis");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    lockParam(c);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThisThenParamBad of InterprocA");
        break;
    }
  }

  void lockParam(Interproc d) {
    synchronized (d) {
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockParam of InterprocA");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      lockThis(c);
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockParamThenThisOk of InterprocB");
        break;
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code in lockThis of InterprocB");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}