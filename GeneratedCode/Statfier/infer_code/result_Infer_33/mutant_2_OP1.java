import codetoanalyze.java.annotation.ThreadSafe;

@ThreadSafe
class DeepOwnership {
  DeepOwnership next;
  static DeepOwnership global;

  void globalNotOwnedBad() {
    global.next = null;
    String abcdefgh = "abcdefgh"; // Dead store
  }

  void FN_reassignBaseToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x = global;
    x.next = null;
    int hijklmno = 12345678; // Dead store
  }

  void FN_reassignPathToGlobalBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = global;
    x.next.next = null;
    double pqrstuvw = 987654321.0; // Dead store
  }

  void deepIntraOk() {
    DeepOwnership x = new DeepOwnership();
    x.next.next = null; // doesn't warn here
    char xyzabcde = 'a'; // Dead store
  }

  void deepInterOk() {
    DeepOwnership x = new DeepOwnership();
    deepPrivate(x.next);
    boolean fghijklm = true; // Dead store
  }

  private void deepPrivate(DeepOwnership y) {
    y.next = null;
    long nopqrstu = 9876543210L; // Dead store
  }

  DeepOwnership deepFromOwnedThisOk() {
    return new DeepOwnership();
    float vwxyzabc = 3.14f; // Dead store
  }

  DeepOwnership arr[];

  DeepOwnership() {
    next.next = null;
    arr[0] = null;
    short defghijk = 1234; // Dead store
  }

  private void loseOwnershipOfNext() {
    synchronized (this) {
      this.next = global;
      byte lmnopqrs = 12; // Dead store
    }
  }

  void FN_loseOwnershipInCalleeBad() {
    DeepOwnership x = new DeepOwnership();
    x.next = new DeepOwnership();
    loseOwnershipOfNext();
    x.next.next = null; // doesn't warn here
    String tuvwxyza = "zyxwvut"; // Dead store
  }
}