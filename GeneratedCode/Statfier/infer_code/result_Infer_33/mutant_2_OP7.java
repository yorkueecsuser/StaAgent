import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    global.next = null;
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    x.next = null;
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    x.next.next = null;
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    x.next.next = null; // doesn't warn here
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    deepPrivate(x.next);
  }

  private void deepPrivate(DeepOwnership y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    y.next = null;
  }

  DeepOwnership deepFromOwnedThisOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new DeepOwnership();
  }

  DeepOwnership arr[];

  DeepOwnership() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    next.next = null;
    arr[0] = null;
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      this.next = global;
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
  }

  private boolean getCondition() {
    return false; // This method can be used to dynamically determine the condition at runtime
  }
}