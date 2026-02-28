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

  // Mutated code
  void reentrantOk(InterclassB x) {
    synchronized (this) {
      synchronized (x) {
        x.interclass1Ok();
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
  }

  // Mutated code
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

  // Mutated code
  void interclass2_ok(Interclass d) {
    synchronized (d) {
      d.interclass2Ok(this);
    }
  }
}