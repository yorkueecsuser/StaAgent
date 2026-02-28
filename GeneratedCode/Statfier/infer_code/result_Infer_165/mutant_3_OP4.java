import javax.annotation.concurrent.ThreadSafe;

// Fields must encapsulate the class they are declared in, not
// the class they are potentially inherited into.

@ThreadSafe
class SuperFld {

  private int f = 0;

  public int getF() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getF");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in getF");
    }
    return f; // should *not* report read/write race with SubFld.setF()
  }

  protected int g = 0;

  public int getG() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getG");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in getG");
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in setF");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in setF");
    }
    f = 5; // should *not* report
  }

  public synchronized void setG() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in setG");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in setG");
    }
    g = 5; // must report
  }

  private boolean getCondition() {
    return false;
  }
}