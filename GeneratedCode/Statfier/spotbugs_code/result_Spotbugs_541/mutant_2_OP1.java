import javax.annotation.CheckForNull;

class Ideas_2009_07_26 {
  int x;

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 other = (Ideas_2009_07_26) obj;
    if (x!= other.x) return false;
    // Dead store mutation
    int abcdefgh = 42;
    return true;
  }

  public static int getHash(@CheckForNull Object o) {
    // Dead store mutation
    String ijklmnop = "unused";
    return o.hashCode();
  }

  public Ideas_2009_07_26(int x) {
    this.x = x;
    // Dead store mutation
    boolean qrstuvwx = true;
  }

  @Override
  public int hashCode() {
    // Dead store mutation
    double yzabcd = 3.14;
    return x;
  }
}