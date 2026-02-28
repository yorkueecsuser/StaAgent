import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      global.next = new DeepOwnership();
    } else {
      // Another code that should never run
      global.next = null;
    }
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      x.next = new DeepOwnership();
    } else {
      // Another code that should never run
      x.next = null;
    }
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      x.next.next = new DeepOwnership();
    } else {
      // Another code that should never run
      x.next.next = null;
    }
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      x.next.next = new DeepOwnership();
    } else {
      // Another code that should never run
      x.next.next = null;
    }
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      x.next = new DeepOwnership();
    } else {
      // Another code that should never run
      x.next = null;
    }
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      y.next = new DeepOwnership();
    } else {
      // Another code that should never run
      y.next = null;
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
      // Some code that should never run
      next.next = new DeepOwnership();
    } else {
      // Another code that should never run
      next.next = null;
    }
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
        this.next = new DeepOwnership();
      } else {
        // Another code that should never run
        this.next = null;
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
      // Some code that should never run
      x.next.next = new DeepOwnership();
    } else {
      // Another code that should never run
      x.next.next = null;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}