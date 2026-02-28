class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    int temp = 0; // Introduced assignment
    int temp2 = temp; // Duplicated assignment
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      int x = 1; // Introduced assignment
      int y = x; // Duplicated assignment
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    int flag = 1; // Introduced assignment
    int flagCopy = flag; // Duplicated assignment
    interproc2Ok(a);
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      int counter = 0; // Introduced assignment
      int counterCopy = counter; // Duplicated assignment
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        int state = 1; // Introduced assignment
        int stateCopy = state; // Duplicated assignment
        reentrant2Ok();
      }
    }
  }

  synchronized void reentrant2Ok() {
    int result = 0; // Introduced assignment
    int resultCopy = result; // Duplicated assignment
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    int index = 0; // Introduced assignment
    int indexCopy = index; // Duplicated assignment
    interproc2(c);
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      int value = 1; // Introduced assignment
      int valueCopy = value; // Duplicated assignment
    }
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      int status = 1; // Introduced assignment
      int statusCopy = status; // Duplicated assignment
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    int code = 0; // Introduced assignment
    int codeCopy = code; // Duplicated assignment
  }
}