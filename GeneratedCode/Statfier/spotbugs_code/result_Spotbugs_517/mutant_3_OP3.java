import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This should never be printed");
      }
      record.field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This should never be printed either");
      }
      field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This should also never be printed");
      }
      lock.notifyAll();
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}