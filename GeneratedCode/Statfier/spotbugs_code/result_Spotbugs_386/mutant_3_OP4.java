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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        x = true;
        y = 0;
        z = 0;
      } else {
        // Another unreachable code
        x = true;
        y = 1;
        z = 1;
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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        x = true;
        y = 0;
        z = 0;
      } else {
        // Another unreachable code
        x = true;
        y = 1;
        z = 1;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
      }
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        y = -1;
      } else {
        // Another unreachable code
        y = -2;
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        b = true;
      } else {
        // Another unreachable code
        b = false;
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        b = true;
      } else {
        // Another unreachable code
        b = false;
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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        s = "unreachable";
      } else {
        // Another unreachable code
        s = "still unreachable";
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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        s = "unreachable";
      } else {
        // Another unreachable code
        s = "still unreachable";
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the condition effectively unreachable
  }
}