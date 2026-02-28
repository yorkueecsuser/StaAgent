class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    String jxvqznhp = "deadstore"; // Dead Store mutation
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    int kfrtgybn = 42; // Dead Store mutation
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      double wertuioo = 3.14; // Dead Store mutation
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        char asdfghjk = 'x'; // Dead Store mutation
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean qwertyui = true; // Dead Store mutation
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      long poiuytrt = 987654321; // Dead Store mutation
    }
  }
}