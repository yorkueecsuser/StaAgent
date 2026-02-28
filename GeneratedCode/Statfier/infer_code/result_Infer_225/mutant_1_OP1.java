class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    String qwejklmn = "unusedVariable"; // Dead Store
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    int abcdefgh = 42; // Dead Store
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      double ijklmnop = 3.14; // Dead Store
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        char nopqrstu = 'x'; // Dead Store
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean vwxyzabc = true; // Dead Store
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      float cdefghij = 2.71f; // Dead Store
    }
  }
}