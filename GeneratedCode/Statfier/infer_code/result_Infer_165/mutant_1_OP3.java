import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      f = 10; // This line is unreachable
    }
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    return g; // must report read/write race with SubFld.setG()
  }

  private boolean getCondition() {
    return false;
  }
}

@ThreadSafe
class SubFld extends SuperFld {

  private int f = 0;

  public synchronized void setF() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      this.f = 10; // This line is unreachable
    }
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      g = 10; // This line is unreachable
    }
    g = 5; // must report
  }

  private boolean getCondition() {
    return false;
  }
}