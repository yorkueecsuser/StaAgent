import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation here
      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        System.out.println("This is unreachable code in foo");
      } else {
        // Alternative code that will also never run
        System.out.println("This is also unreachable code in foo");
      }
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        System.out.println("This is unreachable code in foo2");
      } else {
        // Alternative code that will also never run
        System.out.println("This is also unreachable code in foo2");
      }
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        System.out.println("This is unreachable code in different");
      } else {
        // Alternative code that will also never run
        System.out.println("This is also unreachable code in different");
      }
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}