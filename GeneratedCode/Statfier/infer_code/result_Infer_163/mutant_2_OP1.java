class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    String qzjfnxrb = "unusedVariable"; // Dead Store
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      int klmnopqr = 42; // Dead Store
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean wvutsrqp = true; // Dead Store
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      double yxcvbnml = 3.14; // Dead Store
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        char asdfghjk = 'a'; // Dead Store
      }
    }
  }

  synchronized void reentrant2Ok() {
    float poiuytrewq = 2.71f; // Dead Store
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    long zxcvbnml = 123456789L; // Dead Store
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      short qwertyui = 10; // Dead Store
    }
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      byte mnbvcxz = 1; // Dead Store
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    String hjklpoiuyt = "anotherUnusedVar"; // Dead Store
  }
}