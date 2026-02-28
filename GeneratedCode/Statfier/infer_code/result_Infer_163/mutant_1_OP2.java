class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    interproc2(a); // Mutation: Duplicate method call
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    interproc2Ok(a); // Mutation: Duplicate method call
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        reentrant2Ok(); // Mutation: Duplicate method call
      }
    }
  }

  synchronized void reentrant2Ok() {}
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    interproc2(c); // Mutation: Duplicate method call
  }

  void interproc2(Interproc d) {
    synchronized (d) {
    }
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      interproc2Ok(c); // Mutation: Duplicate method call
    }
  }

  synchronized void interproc2Ok(Interproc d) {}
}