import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation
      // here
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This will never be printed");
          break;
      }
    }
  }

  // Helper method to ensure the condition is dynamically determined
  private static boolean getCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}