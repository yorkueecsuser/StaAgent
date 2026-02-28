class Ideas_2010_05_03 {

  public Ideas_2010_05_03(Boolean x, Boolean b, int y, int z) {
    this.x = x;
    this.b = b;
    this.y = y;
    this.z = z;
    String hgfjkdls; // Dead Store
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
        int qwerasdf; // Dead Store
      }
    }
  }

  public void bad() {
    synchronized (x) {
      if (x) {
        y = 2;
        z = 3;
        x = false;
        boolean zxcvbnml; // Dead Store
      }
    }
  }

  public void veryBad2() {
    synchronized (x) {
      synchronized (b) {
        y++;
        double asdfghjk; // Dead Store
      }
    }
  }

  public void veryBad3() {
    synchronized (b) {
      bad();
      char poiuytrewq; // Dead Store
    }
  }

  public void bad2() {
    synchronized (b) {
      if (b.booleanValue()) b = false;
      float lkjhgfds; // Dead Store
    }
  }

  String s;

  public void bad3() {
    synchronized (x) {
      try {
        s = toString();
        x = false;
        long mnbvcxz; // Dead Store
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
        short qwertyui; // Dead Store
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