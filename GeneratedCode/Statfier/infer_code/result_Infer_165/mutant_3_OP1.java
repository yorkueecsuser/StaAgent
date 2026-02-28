import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    String qvwxyzab = "unused"; // Dead store mutation
    return g; // must report read/write race with SubFld.setG()
  }
}

@ThreadSafe
class SubFld extends SuperFld {

  private int f = 0;

  public synchronized void setF() {
    int rmnptuvw = 10; // Dead store mutation
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    double jklmnopq = 3.14; // Dead store mutation
    g = 5; // must report
  }
}