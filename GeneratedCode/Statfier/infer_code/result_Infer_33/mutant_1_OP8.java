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
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
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
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
  }

  // Mutated code starts here

  void globalNotOwnedBad_m() {
    DeepOwnership a = new DeepOwnership();
    a.next = null;
  }

  void FN_reassignBaseToGlobalBad_m() {
    DeepOwnership b = new DeepOwnership();
    b = global;
    b.next = null;
  }

  void FN_reassignPathToGlobalBad_m() {
    DeepOwnership c = new DeepOwnership();
    c.next = global;
    c.next.next = null;
  }

  void deepIntraOk_m() {
    DeepOwnership d = new DeepOwnership();
    d.next.next = null; // doesn't warn here
  }

  void deepInterOk_m() {
    DeepOwnership e = new DeepOwnership();
    deepPrivate(e.next);
  }

  private void deepPrivate_m(DeepOwnership f) {
    f.next = null;
  }

  DeepOwnership deepFromOwnedThisOk_m() {
    return new DeepOwnership();
  }

  DeepOwnership arr_m[];

  DeepOwnership_m() {
    next.next = null;
    arr_m[0] = null;
  }

  private void loseOwnershipOfNext_m() {
    synchronized (this) {
      this.next = global;
    }
  }

  void FN_loseOwnershipInCalleeBad_m() {
    DeepOwnership g = new DeepOwnership();
    g.next = new DeepOwnership();
    loseOwnershipOfNext_m();
    g.next.next = null; // doesn't warn here
  }
}