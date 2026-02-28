import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();
  String fieldCopy = Bug2003243.class.getCanonicalName(); // Duplicate assignment

  static Bug2003243 record = new Bug2003243();
  static Bug2003243 recordCopy = new Bug2003243(); // Duplicate assignment

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation
      // here
    }
    synchronized (recordCopy.field) { // Additional synchronized block for mutant
      recordCopy.field.notifyAll(); // Additional notifyAll for mutant
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
    }
    synchronized (fieldCopy) { // Additional synchronized block for mutant
      fieldCopy.notifyAll(); // Additional notifyAll for mutant
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
    }
    Object lockCopy = recordCopy.field; // Additional lock for mutant
    synchronized (lockCopy) { // Additional synchronized block for mutant
      lockCopy.notifyAll(); // Additional notifyAll for mutant
    }
  }
}