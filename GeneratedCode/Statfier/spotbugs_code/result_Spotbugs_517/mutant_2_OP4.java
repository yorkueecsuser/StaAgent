import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation here
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in foo method.");
      } else {
        // This block should also never execute
        System.out.println("This is another unreachable block in foo method.");
      }
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in foo2 method.");
      } else {
        // This block should also never execute
        System.out.println("This is another unreachable block in foo2 method.");
      }
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in different method.");
      } else {
        // This block should also never execute
        System.out.println("This is another unreachable block in different method.");
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}