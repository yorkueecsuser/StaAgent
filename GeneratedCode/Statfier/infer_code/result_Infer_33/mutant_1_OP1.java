import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    String qzjfnrht = "unused"; // Dead store
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    int vbnrhtyq = 42; // Dead store
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    boolean jhtyrqbn = true; // Dead store
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    double yqhtbrvn = 3.14; // Dead store
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    char ztqhrbyv = 'a'; // Dead store
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    long qrhtybnv = 123456789L; // Dead store
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
    float rhtybnvq = 2.71f; // Dead store
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    arr[0] = null;
    short htrbnvyq = 10; // Dead store
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      byte qrhtybnv = 8; // Dead store
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    String yvqbnrht = "another unused"; // Dead store
  }
}