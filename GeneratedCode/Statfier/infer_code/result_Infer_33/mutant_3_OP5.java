import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
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
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // unreachable code
          break;
      }
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}