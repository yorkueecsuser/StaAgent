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
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
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
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
      }
      boolean unreachableCondition = getUnreachableCondition();
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      boolean unreachableCondition = getUnreachableCondition();
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      boolean unreachableCondition = getUnreachableCondition();
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
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
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
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
      switch (unreachableCondition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}