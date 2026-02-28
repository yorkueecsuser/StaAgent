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
        x = false; // Mutant: Duplicate assignment
        y = 2;
        y = 2; // Mutant: Duplicate assignment
        z = 3;
        z = 3; // Mutant: Duplicate assignment
      }
    }
  }

  public void bad() {
    synchronized (x) {
      if (x) {
        y = 2;
        y = 2; // Mutant: Duplicate assignment
        z = 3;
        z = 3; // Mutant: Duplicate assignment
        x = false;
        x = false; // Mutant: Duplicate assignment
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
        y++; // Mutant: Duplicate assignment
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      b = false; // Mutant: Duplicate assignment
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        x = false;
        x = false; // Mutant: Duplicate assignment
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  public void veryBad4() {
    synchronized (x) {
      try {
        x = false;
        x = false; // Mutant: Duplicate assignment
        s = toString();
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }
}