import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;
  private int x = 0; // Added for mutation

  public int getF() {
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    return g; // must report read/write race with SubFld.setG()
  }

  public int getX() { // Added for mutation
    return x;
  }

  public void setX(int x) { // Added for mutation
    this.x = x;
  }
}

@ThreadSafe
class SubFld extends SuperFld {

  private int f = 0;
  private int y = 0; // Added for mutation

  public synchronized void setF() {
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    g = 5; // must report
  }

  public int getY() { // Added for mutation
    return y;
  }

  public void setY(int y) { // Added for mutation
    this.y = y;
  }
}