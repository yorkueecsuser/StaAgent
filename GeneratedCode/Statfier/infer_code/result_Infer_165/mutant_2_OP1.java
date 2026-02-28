import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    return f; // should *not* report read/write race with SubFld.setF()
    int qzjfnvxy; // Dead Store mutation
  }

  protected int g = 0;

  public int getG() {
    return g; // must report read/write race with SubFld.setG()
  }
}

@ThreadSafe
class SubFld extends SuperFld {

  private int f = 0;

  public synchronized void setF() {
    f = 5; // should *not* report
    String xwvfrtbn; // Dead Store mutation
  }

  public synchronized void setG() {
    g = 5; // must report
    double rjklmnop; // Dead Store mutation
  }
}