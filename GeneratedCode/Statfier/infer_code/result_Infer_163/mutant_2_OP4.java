class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc1Bad");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc1Bad");
    }
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc2");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc2");
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc1Ok");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc1Ok");
    }
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc2Ok");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc2Ok");
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        boolean condition = getCondition();
        if (condition) {
          // Some unreachable code
          System.out.println("This is unreachable code in reentrant1Ok");
        } else {
          // Alternative unreachable code
          System.out.println("This is also unreachable code in reentrant1Ok");
        }
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in reentrant2Ok");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in reentrant2Ok");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc1Bad of InterprocA");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc1Bad of InterprocA");
    }
  }

  void interproc2(Interproc d) {
    synchronized (d) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc2 of InterprocA");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc2 of InterprocA");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code in interproc1Ok of InterprocB");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in interproc1Ok of InterprocB");
      }
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in interproc2Ok of InterprocB");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in interproc2Ok of InterprocB");
    }
  }

  private boolean getCondition() {
    return false;
  }
}