import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      f = 10;
    } else {
      // Some unreachable code
      f = 20;
    }
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      g = 10;
    } else {
      // Some unreachable code
      g = 20;
    }
    return g; // must report read/write race with SubFld.setG()
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

@ThreadSafe
class SubFld extends SuperFld {

  private int f = 0;

  public synchronized void setF() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      f = 15;
    } else {
      // Some unreachable code
      f = 25;
    }
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      g = 15;
    } else {
      // Some unreachable code
      g = 25;
    }
    g = 5; // must report
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}