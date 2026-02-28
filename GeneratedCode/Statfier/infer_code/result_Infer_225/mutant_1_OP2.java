class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    int temp = 0; // Benign assignment
    int temp2 = temp; // Duplicate of the benign assignment
    a.interclass1Bad();
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      int temp = 0; // Benign assignment
      int temp2 = temp; // Duplicate of the benign assignment
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        int temp = 0; // Benign assignment
        int temp2 = temp; // Duplicate of the benign assignment
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      int temp = 0; // Benign assignment
      int temp2 = temp; // Duplicate of the benign assignment
    }
  }
}