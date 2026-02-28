import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
      record.field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
      field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
      lock.notifyAll();
    }
  }

  private static boolean getCondition() {
    return false;
  }
}