class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    int temp = 0; // Hypothetical assignment statement for demonstration
    int temp2 = temp; // Duplicate of the above assignment
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      int x = 1; // Hypothetical assignment statement for demonstration
      int y = x; // Duplicate of the above assignment
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    int count = 0; // Hypothetical assignment statement for demonstration
    int count2 = count; // Duplicate of the above assignment
    interproc2Ok(a);
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      int z = 2; // Hypothetical assignment statement for demonstration
      int w = z; // Duplicate of the above assignment
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        int m = 3; // Hypothetical assignment statement for demonstration
        int n = m; // Duplicate of the above assignment
        reentrant2Ok();
      }
    }
  }

  synchronized void reentrant2Ok() {
    int p = 4; // Hypothetical assignment statement for demonstration
    int q = p; // Duplicate of the above assignment
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    int r = 5; // Hypothetical assignment statement for demonstration
    int s = r; // Duplicate of the above assignment
    interproc2(c);
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      int t = 6; // Hypothetical assignment statement for demonstration
      int u = t; // Duplicate of the above assignment
    }
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      int v = 7; // Hypothetical assignment statement for demonstration
      int v2 = v; // Duplicate of the above assignment
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    int w = 8; // Hypothetical assignment statement for demonstration
    int w2 = w; // Duplicate of the above assignment
  }
}