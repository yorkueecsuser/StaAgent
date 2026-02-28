class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code");
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    interproc2Ok(a);
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code");
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean condition = getCondition();
        if (condition) {
          // Some unreachable code
          System.out.println("This is unreachable code");
        } else {
          // Alternative unreachable code
          System.out.println("This is also unreachable code");
        }
        reentrant2Ok();
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    interproc2(c);
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code");
      }
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}