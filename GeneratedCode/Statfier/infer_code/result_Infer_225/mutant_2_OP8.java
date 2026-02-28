class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
      }
    }
  }

  // Mutant code
  synchronized void interclass1Bad(InterclassA x) {
    x.interclass1Bad();
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB y) {
    y.interclass1Ok();
  }

  void interclass2Ok(InterclassB z) {
    synchronized (z) {
    }
  }

  void reentrantOk(InterclassB w) {
    synchronized (this) {
      synchronized (w) {
        w.interclass1Ok();
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
  }

  // Mutant code
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass j) {
    j.interclass2Bad();
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
    }
  }

  // Mutant code
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass d) {
    synchronized (d) {
      d.interclass2Ok(this);
    }
  }
}