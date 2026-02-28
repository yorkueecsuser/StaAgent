class Ideas_2010_05_03 {

  public Ideas_2010_05_03(Boolean x, Boolean b, int y, int z) {
    this.x = x;
    this.b = b;
    this.y = y;
    this.z = z;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Unreachable code
    }
  }

  Boolean x, b;

  int y;

  int z;

  public void veryBad() {
    synchronized (x) {
      if (x) {
        x = false;
        y = 2;
        z = 3;
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // Unreachable code
        }
      }
    }
  }

  public void bad() {
    synchronized (x) {
      if (x) {
        y = 2;
        z = 3;
        x = false;
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // Unreachable code
        }
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // Unreachable code
        }
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // Unreachable code
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // Unreachable code
      }
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        x = false;
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // Unreachable code
        }
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  public void veryBad4() {
    synchronized (x) {
      try {
        x = false;
        s = toString();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // Unreachable code
        }
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}