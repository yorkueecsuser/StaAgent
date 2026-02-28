import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      global.next = new DeepOwnership();
    }
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x.next = new DeepOwnership();
    }
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x.next.next = new DeepOwnership();
    }
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x.next.next = new DeepOwnership();
    }
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x.next = new DeepOwnership();
    }
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y.next = new DeepOwnership();
    }
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    arr[0] = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      arr[0] = new DeepOwnership();
    }
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        this.next = new DeepOwnership();
      }
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x.next.next = new DeepOwnership();
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}