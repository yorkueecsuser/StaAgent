import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
  }

  void deepInterOk() {
    DeepOwnership a = new DeepOwnership();
    deepPrivate(a.next);
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    arr[0] = null;
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership b = new DeepOwnership();
    b.next = new DeepOwnership();
    loseOwnershipOfNext();
    b.next.next = null; // doesn't warn here
  }
}