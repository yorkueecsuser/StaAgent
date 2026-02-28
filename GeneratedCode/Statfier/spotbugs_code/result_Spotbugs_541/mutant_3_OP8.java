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

  // Mutated code
  int y;

  @Override
  public boolean equals(Object z) {
    if (z.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 a = (Ideas_2009_07_26) z;
    if (y!= a.y) return false;
    return true;
  }

  public static int getHash(@CheckForNull Object b) {
    return b.hashCode();
  }

  public Ideas_2009_07_26(int y) {
    this.y = y;
  }

  @Override
  public int hashCode() {
    return y;
  }
}