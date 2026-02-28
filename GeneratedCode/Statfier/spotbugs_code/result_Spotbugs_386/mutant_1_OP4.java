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
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        x = true;
        y = 0;
        z = 0;
      } else {
        // Alternative unreachable code
        x = false;
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
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        y = 4;
        z = 5;
      } else {
        // Alternative unreachable code
        y = 5;
        z = 4;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
      }
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        y = 10;
      } else {
        // Alternative unreachable code
        y = 20;
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        veryBad();
      } else {
        // Alternative unreachable code
        bad();
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        b = true;
      } else {
        // Alternative unreachable code
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
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        s = "Unreachable";
      } else {
        // Alternative unreachable code
        s = "Still Unreachable";
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
      boolean shouldRun = false;
      if (shouldRun) {
        // Unreachable code
        x = true;
        s = "Reachable";
      } else {
        // Alternative unreachable code
        x = false;
        s = "Not Reachable";
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }
}