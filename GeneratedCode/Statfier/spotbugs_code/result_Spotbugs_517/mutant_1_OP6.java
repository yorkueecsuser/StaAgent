import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void different() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but will always return false
  }
}