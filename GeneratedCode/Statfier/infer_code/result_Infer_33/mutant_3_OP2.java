import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    global.next = null; // Mutation: duplicated assignment
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    x.next = null; // Mutation: duplicated assignment
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    x.next.next = null; // Mutation: duplicated assignment
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    x.next.next = null; // Mutation: duplicated assignment
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    y.next = null; // Mutation: duplicated assignment
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    next.next = null; // Mutation: duplicated assignment
    arr[0] = null;
    arr[0] = null; // Mutation: duplicated assignment
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      this.next = global; // Mutation: duplicated assignment
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    x.next.next = null; // Mutation: duplicated assignment
  }
}