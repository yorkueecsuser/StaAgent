import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in foo.");
    }
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in foo2.");
    }
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void different() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in different.");
    }
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}