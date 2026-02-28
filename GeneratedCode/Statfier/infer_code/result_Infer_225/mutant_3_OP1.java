class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    String qjvfrtzm = "unusedVariable";
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    int xwvhtnml = 42;
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      double yzqkxjfn = 3.14;
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean lmjvqkzx = true;
      }
    }
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    char gtrhjklm = 'a';
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      long pqrstuvw = 123456789L;
    }
  }
}