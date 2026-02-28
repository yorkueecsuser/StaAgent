import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();
  String fieldCopy = Bug2003243.class.getCanonicalName(); // Added duplicate assignment

  static Bug2003243 record = new Bug2003243();
  static Bug2003243 recordCopy = new Bug2003243(); // Added duplicate assignment

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation
      // here
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    Object lockCopy = record.field; // Added duplicate assignment
    synchronized (lock) {
      lock.notifyAll();
    }
  }
}