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
        x = false; // Mutation: duplicated assignment
        y = 2;
        y = 2; // Mutation: duplicated assignment
        z = 3;
        z = 3; // Mutation: duplicated assignment
      }
    }
  }

  public void bad() {
    synchronized (x) {
      if (x) {
        y = 2;
        y = 2; // Mutation: duplicated assignment
        z = 3;
        z = 3; // Mutation: duplicated assignment
        x = false;
        x = false; // Mutation: duplicated assignment
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
        y++; // Mutation: duplicated assignment
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
      if (b.booleanValue()) b = false; // Mutation: duplicated assignment
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        x = false;
        x = false; // Mutation: duplicated assignment
      } catch (RuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  public void veryBad4() {
    synchronized (x) {
      try {
        x = false;
        x = false; // Mutation: duplicated assignment
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