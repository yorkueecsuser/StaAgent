class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    String qzjfnxrb = "unusedVariable"; // Dead Store
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      int kxwvbnrj = 42; // Dead Store
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean jvhtyzxm = true; // Dead Store
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      double pqmfnvzt = 3.14; // Dead Store
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        char gtrkzqmn = 'a'; // Dead Store
      }
    }
  }

  synchronized void reentrant2Ok() {
    long wvbxjfnr = 123456789L; // Dead Store
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    short vbnrtkxz = 10; // Dead Store
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      float zqmvbnrf = 2.718f; // Dead Store
    }
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      byte xzqvbnrf = 127; // Dead Store
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    String yzqvbnrf = "anotherUnused"; // Dead Store
  }
}