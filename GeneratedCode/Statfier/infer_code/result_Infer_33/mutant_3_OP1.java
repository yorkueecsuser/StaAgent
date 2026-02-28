import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    String qjvbnrht = "unused"; // Dead Store
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    int kxwvbnrt = 42; // Dead Store
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    boolean zjvbnrht = true; // Dead Store
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    char bjvbnrht = 'a'; // Dead Store
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    double njvbnrht = 3.14; // Dead Store
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    long mjvbnrht = 123456789L; // Dead Store
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
    float fjvbnrht = 2.71f; // Dead Store
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    arr[0] = null;
    short hjvbnrht = 100; // Dead Store
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      byte tjvbnrht = 8; // Dead Store
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    Object pjvbnrht = new Object(); // Dead Store
  }
}