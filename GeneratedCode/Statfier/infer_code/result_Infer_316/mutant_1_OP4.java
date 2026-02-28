class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in lockThisThenParamBad");
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some placeholder code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in lockParamA");
      }
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in lockThisThenParamOk");
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some placeholder code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in lockParamB");
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some placeholder code
        } else {
          // Unreachable else branch
          System.out.println("This is an unreachable else branch in lockThisTwiceOk");
        }
        lockThis();
      }
    }
  }

  synchronized void lockThis() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in lockThis");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else branches are unreachable
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in lockThisThenParamBad of InterprocA");
    }
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some placeholder code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in lockParam of InterprocA");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else branches are unreachable
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some placeholder code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in lockParamThenThisOk of InterprocB");
      }
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some placeholder code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in lockThis of InterprocB");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else branches are unreachable
  }
}