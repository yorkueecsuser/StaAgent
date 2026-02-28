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
  String a = Bug2003243.class.getCanonicalName();

  static Bug2003243 b = new Bug2003243();

  @NoWarning("MWN")
  public static void c() {
    synchronized (b.a) {
      b.a.notifyAll(); // There should not be an MWN violation
      // here
    }
  }

  @NoWarning("MWN")
  public void d() {
    synchronized (a) {
      a.notifyAll(); // There should not be an MWN violation here
    }
  }

  @NoWarning("MWN")
  public static void e() {
    Object f = b.a;
    synchronized (f) {
      f.notifyAll();
    }
  }
}