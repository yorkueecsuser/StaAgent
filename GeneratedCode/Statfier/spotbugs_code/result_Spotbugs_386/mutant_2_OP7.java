class Ideas_2010_05_03 {

  public Ideas_2010_05_03(Boolean x, Boolean b, int y, int z) {
    this.x = x;
    this.b = b;
    this.y = y;
    this.z = z;
  }

  Boolean x, b;

  int y;

  int z;

  public void veryBad() {
    synchronized (x) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (x) {
        x = false;
        y = 2;
        z = 3;
      }
    }
  }

  public void bad() {
    synchronized (x) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (x) {
        y = 2;
        z = 3;
        x = false;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        y++;
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      bad();
    }
  }

  public void bad2() {
    synchronized (b) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (b.booleanValue()) b = false;
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        x = false;
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
        while (conditionWhile) {
          // Unreachable while loop
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
    return false; // This method returns false, ensuring the loops are unreachable
  }
}