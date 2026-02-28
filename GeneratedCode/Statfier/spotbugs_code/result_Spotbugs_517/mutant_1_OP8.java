import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

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
    synchronized (lock) {
      lock.notifyAll();
    }
  }

  // Mutated code
  String z = Bug2003243.class.getCanonicalName();

  static Bug2003243 y = new Bug2003243();

  @NoWarning("MWN")
  public static void bar() {
    synchronized (y.z) {
      y.z.notifyAll(); // There should not be an MWN violation
      // here
    }
  }

  @NoWarning("MWN")
  public void bar2() {
    synchronized (z) {
      z.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void distinct() {
    Object x = y.z;
    synchronized (x) {
      x.notifyAll();
    }
  }
}