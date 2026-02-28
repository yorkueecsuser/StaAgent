import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation
      // here
      boolean condition = getUnreachableCondition();
      switch (condition? 1 : 0) {
        case 1:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
      boolean condition = getUnreachableCondition();
      switch (condition? 1 : 0) {
        case 1:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
      boolean condition = getUnreachableCondition();
      switch (condition? 1 : 0) {
        case 1:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}