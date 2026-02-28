class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    String qzjfnrht = "unusedVariable"; // Dead Store
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      int kxvmtwbn = 42; // Dead Store
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean yrtghjkl = true; // Dead Store
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      char vbnrhtyu = 'a'; // Dead Store
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        double wertuiop = 3.14; // Dead Store
      }
    }
  }

  synchronized void reentrant2Ok() {
    long asdfghjk = 100L; // Dead Store
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    float zxcvbnml = 2.718f; // Dead Store
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
      byte mnbvcxza = 5; // Dead Store
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    String poiuytrewq = "anotherUnusedVar"; // Dead Store
  }
}