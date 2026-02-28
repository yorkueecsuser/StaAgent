import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2003243 {

  String field = Bug2003243.class.getCanonicalName();

  static Bug2003243 record = new Bug2003243();

  @NoWarning("MWN")
  public static void foo() {
    synchronized (record.field) {
      record.field.notifyAll(); // There should not be an MWN violation
      // here
      
      // Introduced unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse? 1 : 0) {
        case 2:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public void foo2() {
    synchronized (field) {
      field.notifyAll(); // There should not be an MWN violation here
      
      // Introduced unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse? 1 : 0) {
        case 2:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  @NoWarning("MWN")
  public static void different() {
    Object lock = record.field;
    synchronized (lock) {
      lock.notifyAll();
      
      // Introduced unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch (alwaysFalse? 1 : 0) {
        case 2:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}