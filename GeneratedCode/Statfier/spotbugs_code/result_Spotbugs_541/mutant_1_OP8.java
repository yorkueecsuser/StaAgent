import javax.annotation.CheckForNull;

class Ideas_2009_07_26 {
  int x;

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 other = (Ideas_2009_07_26) obj;
    if (x!= other.x) return false;
    return true;
  }

  public static int getHash(@CheckForNull Object o) {
    return o.hashCode();
  }

  public Ideas_2009_07_26(int x) {
    this.x = x;
  }

  @Override
  public int hashCode() {
    return x;
  }

  // Mutant code
  int y; // Renamed from x to y

  @Override
  public boolean equals(Object a) { // Renamed from obj to a
    if (a.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 b = (Ideas_2009_07_26) a; // Renamed from other to b
    if (y!= b.y) return false; // Renamed from x to y and other.x to b.y
    return true;
  }

  public static int getHash(@CheckForNull Object c) { // Renamed from o to c
    return c.hashCode(); // Renamed from o to c
  }

  public Ideas_2009_07_26(int y) { // Renamed from x to y
    this.y = y; // Renamed from x to y
  }

  @Override
  public int hashCode() {
    return y; // Renamed from x to y
  }
}