import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    g = 5; // must report
  }

  private boolean getCondition() {
    return false;
  }
}