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
    }
  }

  public void bad() {
    synchronized (x) {
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
        y++;
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
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s ", b, x, y, z);
  }

  // Mutated code starts here

  public Ideas_2010_05_03(Boolean a, Boolean c, int d, int e) {
    this.a = a;
    this.c = c;
    this.d = d;
    this.e = e;
  }

  Boolean a, c;

  int d;

  int e;

  public void veryBadA() {
    synchronized (a) {
      if (a) {
        a = false;
        d = 2;
        e = 3;
      }
    }
  }

  public void badB() {
    synchronized (a) {
      if (a) {
        d = 2;
        e = 3;
        a = false;
      }
    }
  }

  public void veryBad2C() {
    synchronized (a) {
      synchronized (c) {
        d++;
      }
    }
  }

  public void veryBad3D() {
    synchronized (c) {
      badB();
    }
  }

  public void bad2E() {
    synchronized (c) {
      if (c.booleanValue()) c = false;
    }
  }

  String f;

  public void bad3F() {
    synchronized (a) {
      try {
        f = toString();
        a = false;
      } catch (RuntimeException g) {
        g.printStackTrace();
      }
    }
  }

  public void veryBad4H() {
    synchronized (a) {
      try {
        a = false;
        f = toString();
      } catch (RuntimeException g) {
        g.printStackTrace();
      }
    }
  }

  @Override
  public String toStringMutated() {
    return String.format("%s %s %s %s ", c, a, d, e);
  }
}