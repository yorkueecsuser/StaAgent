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
      if (x) {
        x = false;
        y = 2;
        z = 3;
      }
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        x = true;
      }
    }
  }

  public void bad() {
    synchronized (x) {
      if (x) {
        y = 2;
        z = 3;
        x = false;
      }
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        y = 0;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
      }
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        z = 0;
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        b = true;
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        x = true;
      }
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        x = false;
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        s = "unreachable";
      }
    }
  }

  public void veryBad4() {
    synchronized (x) {
      try {
        x = false;
        s = toString();
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        y = 1;
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it's not a compile-time constant in the context of the if statement
  }
}