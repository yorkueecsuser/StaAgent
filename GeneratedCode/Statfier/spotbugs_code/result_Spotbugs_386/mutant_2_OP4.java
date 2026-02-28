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
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        x = true;
        y = 0;
        z = 0;
      } else {
        // This block is also unreachable because condition is always false
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
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        y = 4;
        z = 5;
      } else {
        // This block is also unreachable because condition is always false
        y = 5;
        z = 4;
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
        // Mutant: Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because condition is always false
          y = 10;
        } else {
          // This block is also unreachable because condition is always false
          y = 20;
        }
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        veryBad();
      } else {
        // This block is also unreachable because condition is always false
        bad();
      }
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        b = true;
      } else {
        // This block is also unreachable because condition is always false
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
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        s = "unreachable";
      } else {
        // This block is also unreachable because condition is always false
        s = "also unreachable";
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
      // Mutant: Inserting unreachable if-else branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        x = true;
        s = "mutant";
      } else {
        // This block is also unreachable because condition is always false
        x = false;
        s = "another mutant";
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}